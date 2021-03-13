package com.example.demo;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class ImpostoAliquotaService {
	
	public BigDecimal getAliquota(String faixa) throws IllegalArgumentException {
		
		switch(faixa.toUpperCase()) {
		
		case "ISENTO" :
			return new BigDecimal(0);
		case "INTERMEDIARIO" :
			return new BigDecimal(0.2);
		case "MAIOR" :
			return new BigDecimal(0.3);
		default:
			throw new IllegalArgumentException("Faixa invalida");
		}
		
	}
	
	
}
