package com.senac.view;

import com.senac.controller.*;
import java.util.Scanner;

public class view {

	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
	    controller controll = new controller();
		String nome;
		int Tconta;
		
		int op=0;
		System.out.println("Bank of Boston");
		while (op<1) {
			
		
		System.out.println("Digite a opção desejada: "
				         + "\n1-Criar conta"
				         + "\n2-Depositar "
				         + "\n3-Realizar Saque "
				         + "\n4-Realizar investimentos"
				         + "\n5-Consultar saldo"
				         + "\n6-Sair");
		
		op = teclado.nextInt();
         switch (op) {
		case 1:
			System.out.println("Nome do Cliente: ");
			nome = teclado.next();
			System.out.println("Selecione o tipo de conta: \n1- Conta comum \n2- Conta Especial\n3- Conta de investimentos");
			Tconta = teclado.nextInt();
			controll.criarConta(nome, Tconta);
			
			op=0;
			break;

		case 2:
			System.out.println("Numero da conta: ");
			int nconta=teclado.nextInt();
			System.out.println("valor: ");
			double rs = teclado.nextDouble();
			System.out.println();
			controll.deposito(nconta, rs);
			op=0;
			break;
		case 3:
			System.out.println("Numero da conta: ");
			nconta = teclado.nextInt();
			System.out.println("valor: ");
			rs = teclado.nextDouble();
			controll.saque(nconta, rs);
			op = 0;

			break;
		case 4:
			System.out.println("Numero da conta: ");
			nconta = teclado.nextInt();
			System.out.println("valor da taxa: ");
			rs = teclado.nextDouble();
			controll.investimento(nconta, rs);
			op = 0;
			break;
		case 5:
			System.out.println("Numero da conta: ");
			nconta = teclado.nextInt();
			controll.csaldo(nconta);
			op = 0;
			break;
		case 6:
			op = 1;
			break;
		default:
			System.err.println("DIGITO INVÁLIDO");
			op = 0;
			break;
		}
		}
	}

}
