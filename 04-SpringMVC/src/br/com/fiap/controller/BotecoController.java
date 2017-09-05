package br.com.fiap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.dao.BotecoDAO;
import br.com.fiap.model.Boteco;

@Controller
@RequestMapping("/boteco")
public class BotecoController {

	@Autowired
	private BotecoDAO dao;

	@GetMapping("cadastrar")
	public String abrirForm() {
		return "boteco/cadastro";
	}

	@Transactional
	@PostMapping("cadastrar")
	public ModelAndView processarForm(Boteco boteco) {
		dao.cadastrar(boteco);
		ModelAndView retorno = new ModelAndView("boteco/lista");
		retorno.addObject("botecos", dao.listar());
		return retorno;
	}
	
	@GetMapping("listar")
	public ModelAndView listar() {		
		ModelAndView retorno = new ModelAndView("boteco/lista");
		retorno.addObject("botecos", dao.listar());
		return retorno;
	}

}