package com.senac.model.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.senac.model.Especial;

public class EspecialTest {

private Especial Exp;
	
	@Before
	public void setUp() throws Exception {
		Exp = new Especial();
		
	}
	
	@Test
	public void testDepositoEspecial() {
		Exp.Depositar(5);
		assertEquals(5, Exp.getSaldo(), 0);
	}

}
