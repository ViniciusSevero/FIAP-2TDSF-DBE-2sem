package br.com.fiap.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.dao.BotecoDAO;
import br.com.fiap.dao.CervejaDAO;
import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.model.Cerveja;

@Controller
@RequestMapping("/cerveja")
public class CervejaController {

	@Autowired
	private CervejaDAO dao;

	@GetMapping("cadastrar")
	public ModelAndView form() {
		return new ModelAndView("cerveja/cadastro").addObject("cerveja", new Cerveja());
	}
	
	@GetMapping("alterar/{id}")
	public ModelAndView abrirFormEdicao(@PathVariable("id") int id){
		ModelAndView retorno = new ModelAndView("cerveja/alterar");
		retorno.addObject("cerveja", dao.buscar(id));
		return retorno;
	}
	
	@Transactional
	@GetMapping("excluir/{id}")
	public ModelAndView excluir(@PathVariable("id") int id, RedirectAttributes redirect){
		try {
			dao.excluir(id);
			redirect.addFlashAttribute("msg", "Cadastrado!");
		} catch (CodigoInvalidoException e) {
			e.printStackTrace();
			redirect.addFlashAttribute("msg", "Erro ao excluir!");
		}
		return new ModelAndView("redirect:/cerveja/listar");
	}
	
	@Transactional
	@PostMapping("alterar")
	public ModelAndView alterar(Cerveja cerveja, RedirectAttributes redirect) {
		dao.atualizar(cerveja);
		redirect.addFlashAttribute("msg", "Cadastrado!");
		return new ModelAndView("redirect:/cerveja/listar");
	}

	@Transactional
	@PostMapping("cadastrar")
	public ModelAndView processaForm(Cerveja cerveja, RedirectAttributes redirect) {
		dao.cadastrar(cerveja);
		redirect.addFlashAttribute("msg", "Cadastrado!");
		return new ModelAndView("redirect:/cerveja/listar");
	}

	@GetMapping("listar")
	public ModelAndView lista() {
		return new ModelAndView("cerveja/lista").addObject("cervejas", dao.listar());
	}

}