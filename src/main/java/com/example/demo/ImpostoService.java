package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ImpostoService {
	
	public String getFaixaDaAliquota(int rendimento) throws IllegalArgumentException {
		
		if(rendimento < 0) {
			throw new IllegalArgumentException("Rendimento negativo é inválido!");
		}
		
		if(rendimento < 1000) return "ISENTO";
		else if(rendimento < 5000) return "INTERMEDIARIO";
		else return "MAIOR";
	}
	
	public List<String> getFaixas(){
		return List.of("ISENTO","INTERMEDIARIO","MAIOR");
	}
	
	

}
