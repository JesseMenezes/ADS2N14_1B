package com.senac.mvc.view;

import static java.lang.System.out;

import com.senac.mvc.controller.PessoaController;
import com.senac.mvc.data.SalvarContato;

public class ExtendedView extends ContatoView {
	
		
	public void printContato(String nome, String telefone, String endereco)
	{
		out.println("Nome: " + nome);
		out.println("Contato " + telefone);
		out.println("Endereco: " + endereco);
		
	}
	
	
}
