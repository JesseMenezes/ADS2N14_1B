package com.senac.mvc.app;

import static java.lang.System.out;

import com.senac.mvc.controller.PessoaController;
import com.senac.mvc.data.SalvarContato;
import com.senac.mvc.view.ExtendedView;

public class AgendaTelefonica {

	private static SalvarContato teste;

	public static void main(String[] args) {
		teste = new SalvarContato("teste.txt");
		for (int i = 1; i <= 50; i++) {

			PessoaController controller = new PessoaController();
			controller.criarContato();
			controller.criarEndereco();
			controller.criarTelefone();
			out.println("-------------------------");
			out.println("Contato " + i);
			controller.exibirContato(new ExtendedView());
			
			teste.gravar(String.valueOf(i));
			teste.gravar("\n");
			teste.gravar(controller.getContato().getNome());
			teste.gravar("\n");
			teste.gravar(controller.getContato().getTelefone());
			teste.gravar("\n");
			teste.gravar(controller.getContato().getEndereco());
			teste.gravar("\n");
		}
		teste.close();
	}
}
