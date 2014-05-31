package com.senac.model.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.senac.model.Conta;
import com.senac.model.cliente;

public class ContaTest {

	private Conta cont;
	
	@Before
	public void setUp() throws Exception {
		cont = new Conta();
		
	}
	
	@Test
	public void testdepositorealizadocomsucesso() {
		cont.Depositar(10);
		assertEquals(10, cont.getSaldo(), 0);
	}

}
