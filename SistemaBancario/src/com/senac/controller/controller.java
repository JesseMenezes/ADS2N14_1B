package com.senac.controller;

import java.util.Scanner;
import com.senac.model.*;

public class controller {
	private static Scanner teclado = new Scanner(System.in);
	cliente cliente;
	Conta Tpconta[] = new Conta[10];
	Especial TpEspecial[] = new Especial[10];
	investimento TpInvestimento[] = new investimento[10];
	int nc1 = 0, 
	    nc2 = 0,
        nc3 = 0,
	    nc  = 1,
	    conf;
	boolean Realizado = false;

	public void criarConta(String texto, int valor) {
		cliente = new cliente(texto, valor);
		switch (valor) {
		case 1:
			Tpconta[nc1] = new Conta();
			Tpconta[nc1].setCliente(cliente);
			Tpconta[nc1].setNumConta(nc);
			System.out.println("\nConta Aberta com Sucesso!!\n"); 
			System.out.println("Cliente: " + Tpconta[nc1].getCliente().getNome());
			System.out.println("Conta :" + Tpconta[nc1].getNumConta());
			System.out.println("Tipo: Conta Corrente");
			Tpconta[nc1].setSaldo(0);
			nc++;
			nc1++;
			break;
		case 2:
			TpEspecial[nc2] = new Especial();
			TpEspecial[nc2].setCliente(cliente);
			TpEspecial[nc2].setNumConta(nc);
			System.out.println("\nConta Aberta com Sucesso!! \n"); 
			System.out.println("Cliente: " + TpEspecial[nc2].getCliente().getNome());
			System.out.println("Conta :" + TpEspecial[nc2].getNumConta());
			System.out.println("Tipo: Conta Especial");

			TpEspecial[nc2].setSaldo(0);
			nc2++;
			nc++;
			break;
		case 3:
			TpInvestimento[nc3] = new investimento();
			TpInvestimento[nc3].setCliente(cliente);
			TpInvestimento[nc3].setNumConta(nc);
			TpInvestimento[nc3].setSaldo(0);
			System.out.println("\nConta Aberta com Sucesso!! \n"); 
			System.out.println("Cliente: " + TpInvestimento[nc3].getCliente().getNome());
			System.out.println("Conta :" + TpInvestimento[nc3].getNumConta());
			System.out.println("Tipo: Conta Investimento");
			nc++;
			nc3++;
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}

	}

	public void deposito(int TipoConta, double vdeposito) {

		for (int i = 0; i < nc1; i++) {
			if (Tpconta[i].getNumConta() == TipoConta) {
				System.out.println("Depósito: R$ " + vdeposito);
				System.out.println("Conta : " + Tpconta[i].getCliente().getNome());
				System.out.println("Confirma Operação?");
				System.out.println("\n1 - sim\n2 - não");
				conf = teclado.nextInt();
				if (conf == 1) {
					Tpconta[i].Depositar(vdeposito);
					Realizado = true;
				} else
					System.out.println("Transação Inválida!!");
			}
		}
		for (int i = 0; i < nc2; i++) {
			if (TpEspecial[i].getNumConta() == TipoConta) {
				System.out.println("Você deseja depositar:R$ " + vdeposito
						+ " Na conta de: " + TpEspecial[i].getCliente().getNome()
						+ "\n1 - sim\n2 - não");
				conf = teclado.nextInt();
				if (conf == 1) {
					TpEspecial[i].Depositar(vdeposito);
					Realizado = true;
				} else
					System.out.println("Operação Cancelada");
			}
		}

		for (int i = 0; i < nc3; i++) {
			if (TpInvestimento[i].getNumConta() == TipoConta) {
				System.out.println("Você deseja depositar:R$ " + vdeposito
						+ " Na conta de: " + TpInvestimento[i].getCliente().getNome()
						+ "\n1 - sim\n2 - não");
				conf = teclado.nextInt();
				if (conf == 1) {
					TpInvestimento[i].Depositar(vdeposito);
					Realizado = true;
				} else
					System.out.println("da proxima faça com mais atencao");
			}
		}
		
		if(Realizado==true)
		{
			System.out.println("Deposito realizado com sucesso!");
		}

	}

	public void versaldo()
	{
		//System.out.println(conta1[0].getSaldo());
		//System.out.println(conta1[1].getSaldo());
	}
	
	
}
