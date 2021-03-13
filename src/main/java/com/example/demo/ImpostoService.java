package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpostoService {
	
	@Autowired
	private ImpostoAliquotaService aliquotaService;
	
	public String getFaixaDaAliquota(int rendimento) throws IllegalArgumentException {
		
		if(rendimento < 0) {
			throw new IllegalArgumentException("Rendimento negativo é inválido!");
		}
		
		if(rendimento < 1000) return "ISENTO";
		else if(rendimento < 5000) return "INTERMEDIARIO";
		else return "MAIOR";
	}
	
	public BigDecimal calculaImposto(int rendimento) {
		BigDecimal aliquota = aliquotaService.getAliquota(getFaixaDaAliquota(rendimento));
		
		BigDecimal imposto = aliquota.multiply(new BigDecimal(rendimento));
		
		return imposto;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
