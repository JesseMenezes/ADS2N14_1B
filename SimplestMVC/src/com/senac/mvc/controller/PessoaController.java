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
			
		int i, nomeRua, segundoNomeRua, nomeTipoEndereco, tipoEnd;

		String rua[] = { "Visconde", "General", "Comendador", "Lima"}, vc = "", nome = "", nomeRuaDois[] = {
				"Silva", "Soares", "Escobar", "Vargas" }, tipoEndereco[] = {"Rua", "Avenida", "Travessa", "Praça"};

		Random random = new Random();

		for (i = 0; i <= 0; i++) {

			nomeRua = 0 + random.nextInt(4);

			segundoNomeRua = 0 + random.nextInt(4);

			int x = random.nextInt(1000);
			String parteNumeroUm = Integer.toString(x); 

			tipoEnd = 0 + random.nextInt(4);

			vc = tipoEndereco[tipoEnd] + " " + rua[nomeRua] + " "
					+ nomeRuaDois[segundoNomeRua] + " " + parteNumeroUm;

			nome = vc;
           contato.setEndereco(nome); 
	    }  
    }
	
	public void criarTelefone()
	{
		Random random = new Random();
		int x = random.nextInt(1000);
		int y = random.nextInt(10000);
		int tipoTelefoneN;

		String parteNumeroUm = Integer.toString(x);  
		String parteNumeroDois = Integer.toString(y);


		tipoTelefoneN = 0 + random.nextInt(4);

		String tipo[] = { "Celular", "Residencial", "Comercial", "Fax"};

		String numeroFinal = " " + tipo[tipoTelefoneN] + ": " + parteNumeroUm + "-" + parteNumeroDois;

		contato.setTelefone(numeroFinal);
		
    }
		
	
	public void exibirContato( ContatoView view )
	{
		view.printContato(contato.getNome(), contato.getTelefone(), contato.getEndereco());
	}
	
}
