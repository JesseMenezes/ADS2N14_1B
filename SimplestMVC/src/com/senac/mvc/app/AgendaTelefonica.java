package com.senac.mvc.app;

import static java.lang.System.out;

import com.senac.mvc.controller.PessoaController;
import com.senac.mvc.view.ExtendedView;

public class AgendaTelefonica {

	
	public static void main(String[] args) {
		for(int i = 1; i <= 50; i++){
        
			PessoaController controller = new PessoaController();
			controller.criarContato();
			controller.criarEndereco();
			controller.criarTelefone();
			out.println("-------------------------");
			out.println("Contato " + i );
			controller.exibirContato(new ExtendedView());
     	}
    }
}
