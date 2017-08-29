package br.com.fiap.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.bean.Cerveja;
import br.com.fiap.model.CervejaDAO;

@Controller
@RequestMapping("/cerveja")
public class CervejaController {
	private CervejaDAO _dao;
	
	public CervejaController() {
		_dao = new CervejaDAO();
	}
	
	@GetMapping("cadastrar")
	public String abrirForm(){
		return "cerveja/cadastro";
	}
	
	@PostMapping("cadastrar")
	public String cadastrar(Cerveja cerveja){
		this._dao.cadastrar(cerveja);
		return "redirect:/cerveja/listar";
	}
	
	@GetMapping("listar")
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("cerveja/lista");
		List<Cerveja> cervejas = this._dao.getCervejas();
		mv.addObject("lista", cervejas);
		return mv;
	}
}
