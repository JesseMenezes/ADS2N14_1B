package com.senac.model.test;
import org.junit.Before;
import org.junit.Test;

import com.senac.model.cliente;

import static org.junit.Assert.*;

import org.junit.Test;

public class clienteTest {
	private cliente client;
	
	@Before
	public void setUp() throws Exception {
		client = new cliente("joao", 1);
	}
	
	@Test
	public void testclientecriado() {
		assertEquals("joao", client.getNome());
		assertEquals(1, client.getConta());
	}

}
