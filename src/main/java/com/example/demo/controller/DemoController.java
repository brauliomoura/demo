package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/despesa")
public class DemoController {
	
	@RequestMapping("/home")
	public String home() {
		return "pagina-inicial-despesas";
	}
	
	@RequestMapping("/categoria")
	public String categoria(@RequestParam("nome") String nomeCategoria, Model model) {
		String mensagem = null;
		if(nomeCategoria != null && !nomeCategoria.isEmpty() ) {
			mensagem = "Categoria informada " + nomeCategoria.toUpperCase();
		}else {
			mensagem = "Nenhuma categoria foi informada!";
		}
		
		model.addAttribute("mensagem", mensagem);
		
		return "exibe-categoria";
	}
}






