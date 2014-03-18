package com.senac.mvc.controller;

import com.senac.mvc.model.Pessoa;
import com.senac.mvc.view.ContatoView;

import java.util.Random;

public class PessoaController {

	private Pessoa contato;
	
	public void criarContato()
	{
		
	    int i, nomeAleatorio,sobrenomeAleatorio;
            
	    String nome [] = {" Aaron"," GianCarlo"," Anna"," Jonathan"," Betsy"," R.J"," Vince", "Dean", "Bob"},
	    	   sobrenome []	={"Odenkirk ","Brandt ","Paul ", "Gunn", "Esposito", "Banks", "Mitte","Gilighan","Norris"},
	    	   nomecompleto = "";
   		       
            
	    Random random = new Random();
            
        nomeAleatorio = 0 + random.nextInt(9);
        sobrenomeAleatorio = 0 + random.nextInt(9);
        nomecompleto = nome[nomeAleatorio] + " " + sobrenome[sobrenomeAleatorio];
        contato = new Pessoa();
		contato.setNome(nomecompleto);
		contato.setTelefone("555-1234");
		contato.setEndereco("rua teste");
 
        
    }
		
	
	public void exibirContato( ContatoView view )
	{
		view.printContato(contato.getNome(), contato.getTelefone(), contato.getEndereco());
	}
	
}
