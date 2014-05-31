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
	    Agree;
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
				Agree = teclado.nextInt();
				if (Agree == 1) {
					Tpconta[i].Depositar(vdeposito);
					Realizado = true;
				} else
					System.out.println("Transação Inválida!!");
			}
		}
		for (int i = 0; i < nc2; i++) {
			if (TpEspecial[i].getNumConta() == TipoConta) {
				System.out.println("Você deseja depositar:R$ " + vdeposito);
				System.out.println(" Na conta de: " + TpEspecial[i].getCliente().getNome());
				System.out.println( "\n1 - sim\n2 - não");
				Agree = teclado.nextInt();
				if (Agree == 1) {
					TpEspecial[i].Depositar(vdeposito);
					Realizado = true;
				} else
					System.out.println("Transação Inválida!!");
			}
		}

		for (int i = 0; i < nc3; i++) {
			if (TpInvestimento[i].getNumConta() == TipoConta) {
				System.out.println("Você deseja depositar:R$ " + vdeposito);
				System.out.println(" Na conta de: " + TpInvestimento[i].getCliente().getNome());
				System.out.println("\n1 - sim\n2 - não");
				Agree = teclado.nextInt();
				if (Agree == 1) {
					TpInvestimento[i].Depositar(vdeposito);
					Realizado = true;
				} else
					System.out.println("Transação Inválida!!");
			}
		}
		
		if(Realizado==true)
		{
			System.out.println("Deposito realizado com sucesso!");
		}

	}

	public void saque(int n, double vsaque) {

		for (int i = 0; i < nc1; i++) {
			if (Tpconta[i].getNumConta() == n) {
			   	System.out.println("Você deseja sacar :R$ " + vsaque);
			   	System.out.println(" Na conta de: " + Tpconta[i].getCliente().getNome());
			   	System.out.println("\n1 - sim\n2 - não");
				Agree = teclado.nextInt();
				if (Agree == 1) {
					Tpconta[i].Saque(vsaque);
					Realizado = true;
				} else
					System.out.println("Transação Inválida!!");
			}
		}
		for (int i = 0; i < nc2; i++) {
			if (TpEspecial[i].getNumConta() == n) {
				System.out.println("Você deseja sacar:R$ " + vsaque);
				System.out.println(" Na conta de: " + TpEspecial[i].getCliente().getNome());
				System.out.println("\n1 - sim\n2 - não");
				Agree = teclado.nextInt();
				if (Agree == 1) {
					TpEspecial[i].Saque(vsaque);
					Realizado = true;
				} else
					System.out.println("Transação Inválida!!");
			}
		}

		for (int i = 0; i < nc3; i++) {
			if (TpInvestimento[i].getNumConta() == n) {
				System.out.println("Você deseja sacar:R$ " + vsaque);
				System.out.println(" da conta de: " + TpInvestimento[i].getCliente().getNome());
				System.out.println("\n1 - sim\n2 - não");
				Agree = teclado.nextInt();
				if (Agree == 1) {
					TpInvestimento[i].Saque(vsaque);
					Realizado = true;
				} else
					System.out.println("Transação Inválida!!");
			}
		}



	}

	public void investimento(int n,double taxa)
	{
		for(int i=0;i<1;i++)
		{
			if(TpInvestimento[i].getNumConta()==n)
			{

				System.out.println("Você deseja fazer o investimento com a taxa: " + taxa);
				System.out.println(" Na conta de: " + TpInvestimento[i].getCliente().getNome());
				System.out.println("\n1 - sim\n2 - não");
				Agree = teclado.nextInt();
				if (Agree == 1) {
					TpInvestimento[i].dividendos(taxa);
					System.out.println("Investimento realizado com sucesso");

				} else {
					System.out.println("Operação Cancelada");
			}

			} else {

				System.out.println("Sua conta não é do tipo de investimento");
            }
		}
	}

	public void csaldo(int n)
	{
		Realizado=false;
		for (int i = 0; i < nc1; i++) {
			if (Tpconta[i].getNumConta() == n) {
				System.out.println("seu saldo é: "+Tpconta[i].getSaldo());
				Realizado=true;
			}
		}
		for (int i = 0; i < nc2; i++) {
			if (TpEspecial[i].getNumConta() == n) {
				System.out.println("seu saldo é: "+TpEspecial[i].getSaldo());
				Realizado = true;	
			} 
			}


		for (int i = 0; i < nc3; i++) {
			if (TpInvestimento[i].getNumConta() == n) {
				System.out.println("seu saldo é: "+TpInvestimento[i].getSaldo());
				Realizado = true;
			}
		}

		if(Realizado==false)
		{
			System.out.println("conta não encontrada");
		}

	}


}
