package com.senac.dt;

import static org.junit.Assert.*;

import org.junit.Test;

public class dtteste {
	
	@Test
	
	public void deveriaavancar() throws Exception{
	    DesertTruck dt = new DesertTruck();
    	String comand = "avancar";
	    assertEquals("avancar", dt.avancar(comand));
	
	}

	public void deveriavoltar() throws Exception{
	    DesertTruck dt = new DesertTruck();
    	String comand = "voltar";
	    assertEquals("voltar", dt.voltar(comand));
	
	}
	
	public void deveriacarregar() throws Exception{
	    DesertTruck dt = new DesertTruck();
    	String comand = "carregar";
	    assertEquals("carregar", dt.carregar(comand));
	
	}

	

}


