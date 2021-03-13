package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class ImpostoServiceTest {
	
	private ImpostoService service = new ImpostoService();
	
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
	public void seTodasFaixasEstaoPresentes() {
		final List<String> todasFaixas = service.getFaixas();
		assertTrue(!todasFaixas.isEmpty());
		assertArrayEquals(todasFaixas.toArray(), new Object[] {"ISENTO", "INTERMEDIARIO","MAIOR"});
	}
	

}
