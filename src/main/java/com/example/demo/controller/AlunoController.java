package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Aluno;

@Controller
public class AlunoController {
	
	@RequestMapping("/aluno/form")
	public String exibeForm(Model model) {
		model.addAttribute("aluno", new Aluno());
		return "aluno-form";
	}
	
	@RequestMapping("/aluno/registra")
	public String registraAluno(@ModelAttribute("aluno") Aluno aluno) {
		return "confirmacao-aluno";
	}
	
	
	
	
	
	
	
}
