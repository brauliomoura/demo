package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Aluno;

@Controller
public class HomeController {
	
	@RequestMapping("/despesa/form")
	public String despesa(Model model)
	{
		return "cadastro-despesa";
	}

	@RequestMapping("/aluno/form")
	public String exibeFormulario(Model model) {
		model.addAttribute("aluno", new Aluno());
		return "aluno-form";
	}
	
	@RequestMapping("/aluno/registraAluno")
	public String registra(@ModelAttribute("aluno") Aluno aluno) {
		
		return "confirmacao-aluno";
	}
	
	
}
