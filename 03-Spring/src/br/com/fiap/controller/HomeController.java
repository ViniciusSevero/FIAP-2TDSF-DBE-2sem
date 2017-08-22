package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fiap.bean.Unicornio;

@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public String home(){
		return "home/index";
	}
}
