package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FaixaDeImpostoService {
	
	public List<String> getFaixas(){
		return List.of("ISENTO","INTERMEDIARIO","MAIOR");
	}
	
	

}
