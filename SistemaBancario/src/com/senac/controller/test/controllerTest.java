package com.senac.controller.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.senac.controller.controller;
import com.senac.model.Conta;
import com.senac.model.cliente;

public class controllerTest {
	controller control;
	Conta cont;
	cliente cli;
	@Test
	public void testcriarconta() {
	//testa se a conta foi criada com sucesso
	//testa entrada do nome e tipo de conta do cliente
		control = new controller();
		//testa conta comun
		control.criarConta("joao", 1);
		//assertEquals("joao", cont[1].getCliente().getNome());
		//testa conta especial
		control.criarConta("joao", 2);
		//testa conta investimento
		control.criarConta("joao", 3);
		//testa conta invalida
		control.criarConta("joao", 5);
	}
	
	public void testrealizadeposito(){
	//testa se o deposito foi realizado com sucesso
		control = new controller();
		cont = new Conta();
		//testa deposito em conta comun
		control.deposito(1, 1);
		cont.Depositar(1);
		//testa deposito em conta especial
		control.deposito(2, 1);
		cont.Depositar(1);
		//testa deposito em conta investimento
		control.deposito(3, 1);
		cont.Depositar(1);
		//testa deposito em conta invalida
		control.deposito(4, 1);
				
	}
    	

}
