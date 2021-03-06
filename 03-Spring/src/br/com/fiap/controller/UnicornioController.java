package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.bean.Unicornio;

@Controller
@RequestMapping("/unicornio")
public class UnicornioController {
	@GetMapping("cadastrar")
	public String cadastrar(){
		return "unicornio/cadastro";
	}
	
	@PostMapping("cadastrar")
	public ModelAndView cadastrar(Unicornio unicornio){
		ModelAndView mv = new ModelAndView("unicornio/lista");
		mv.addObject("unicornio",unicornio);
		return mv;
	}
}
