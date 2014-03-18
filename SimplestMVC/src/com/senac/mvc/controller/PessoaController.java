package com.senac.mvc.controller;

import com.senac.mvc.model.Pessoa;
import com.senac.mvc.view.ContatoView;

import java.util.Random;

public class PessoaController {

	private Pessoa contato;
	
	public void criarContato()
	{
		
	    int i,nrAleatorioVogal,nrAleatorioConsoante;
            
	    String vogal [] = {" Aaron"," GianCarlo"," Anna"," Jonathan"," Betsy"," R.J"," Vince", "Dean", "Bob"},vc = "" ,nome = "",consoante [] 
	    		={"Odenkirk ","Brandt ","Paul ", "Gunn", "Esposito", "Banks", "Mitte","Gilighan","Norris"};
            
	    Random random = new Random();
            
        nrAleatorioVogal = 0 + random.nextInt(9);
        nrAleatorioConsoante = 0 + random.nextInt(9);
        vc = vogal[nrAleatorioVogal] + " " + consoante[nrAleatorioConsoante];
        nome = vc;
		contato = new Pessoa();
		contato.setNome(vc);
		contato.setTelefone("555-1234");
		contato.setEndereco("rua teste");
 
        
    }
		
	
	public void exibirContato( ContatoView view )
	{
		view.printContato(contato.getNome(), contato.getTelefone(), contato.getEndereco());
	}
	
}
