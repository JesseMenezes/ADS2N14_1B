package com.senac.mvc.controller;

import com.senac.mvc.model.Pessoa;
import com.senac.mvc.view.ContatoView;

import java.util.Random;

public class PessoaController {

	Pessoa contato = new Pessoa();	
		
	
	public void criarContato()
	{
			
	    int nomeAleatorio,sobrenomeAleatorio;
            
	    String nome [] = {" Aaron"," GianCarlo"," Anna"," Jonathan"," Betsy"," R.J"," Vince", "Dean", "Bob"},
	    	   sobrenome []	={"Odenkirk ","Brandt ","Paul ", "Gunn", "Esposito", "Banks", "Mitte","Gilighan","Norris"},
	    	   nomecompleto = "";
   		       
	    Random random = new Random();
            
        nomeAleatorio = 0 + random.nextInt(9);
        sobrenomeAleatorio = 0 + random.nextInt(9);
        nomecompleto = nome[nomeAleatorio] + " " + sobrenome[sobrenomeAleatorio];
        
		contato.setNome(nomecompleto);

        
    }
	
	public void criarEndereco()
	{
			
		int nomeRua, segundoNomeRua, tipoEnd;

		String rua[] = { "João", "André", "Otto", "Andrade", "Wenceslau", "Padre", "Luciana"}, 
		       nomeRuaDois[] = { "Pessoa", "da Rocha", "Niemeyer", "Neves", "Escobar", "Cacique", "de Abreu" },
		       tipoEndereco[] = {"Rua", "Avenida", "Praça", "Largo"},
		       nomecompleto;

		Random random = new Random();

    	nomeRua = 0 + random.nextInt(7);

		segundoNomeRua = 0 + random.nextInt(7);

	    int x = random.nextInt(1000);
		String parteNumeroUm = Integer.toString(x); 

		tipoEnd = 0 + random.nextInt(4);

		nomecompleto = tipoEndereco[tipoEnd] + " " + rua[nomeRua] + " " +
		     nomeRuaDois[segundoNomeRua] + " " + parteNumeroUm;

		contato.setEndereco(nomecompleto); 
     }
	
	public void criarTelefone()
	{
		Random random = new Random();
		int z = random.nextInt(99);
		int x = random.nextInt(10000);
		int y = random.nextInt(10000);
		int tipoTelefoneN;

		String ddd = Integer.toString(z);
		if (ddd.length() < 2){
			ddd = "0" + ddd;
		}
		String parteNumeroUm = Integer.toString(x);  
		String parteNumeroDois = Integer.toString(y);


		tipoTelefoneN = 0 + random.nextInt(4);

		String tipo[] = { "Celular", "Residencial", "Comercial", "Fax"};

		String numeroFinal = tipo[tipoTelefoneN] + ": " + "(" + ddd + ")" + parteNumeroUm + "-" + parteNumeroDois;

		contato.setTelefone(numeroFinal);
		
    }
		
	
	public void exibirContato( ContatoView view )
	{
		view.printContato(contato.getNome(), contato.getTelefone(), contato.getEndereco());
	}
	
}
