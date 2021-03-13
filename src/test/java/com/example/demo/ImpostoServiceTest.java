package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration (classes = {ImpostoService.class})
public class ImpostoServiceTest {
	
	@Autowired
	private ImpostoService service;
	
	@MockBean
	private ImpostoAliquotaService impostoAliquotaService;
	
	@Test
	public void seAliquotaIsentoParaRendimentoMenorQue1000() {
		final String faixaImposto = service.getFaixaDaAliquota(500);
		assertTrue(faixaImposto.equalsIgnoreCase("ISENTO"));
	}
	
	@Test
	public void seExcecaoOcorreParaRendimentoNegativo() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			service.getFaixaDaAliquota(-500);	
		});
	}

	@Test
	public void seCalculaValorCorretoDoImposto() {
		
		Mockito.when(impostoAliquotaService.getAliquota(Mockito.any(String.class))).thenReturn(new BigDecimal(0.5));
		
		BigDecimal imposto = service.calculaImposto(3000);
		
		assertTrue(imposto.equals(new BigDecimal(3000).multiply(new BigDecimal(0.5))));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
