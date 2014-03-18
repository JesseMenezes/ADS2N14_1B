package com.senac.mvc.app;

import com.senac.mvc.controller.PessoaController;
import com.senac.mvc.view.ExtendedView;

public class AgendaTelefonica {

	
	public static void main(String[] args) {
		for(int i = 0; i <= 50; i++){
        
			PessoaController controller = new PessoaController();
			controller.criarContato();			
			controller.exibirContato(new ExtendedView());
     	}
    }
}
