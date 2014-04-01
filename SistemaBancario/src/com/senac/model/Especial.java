package com.senac.model;

public class Especial extends Conta {
private double limite=0;


public void setLimite(double limite)
{
	this.limite=this.limite-limite;
}
	
public void Saque(double valor)
{
	if((getSaldo()-valor<this.limite))
			{
		          
		System.out.println("Saldo insufiente!!");
		
			}
	else
	{
		
		double valor2 = getSaldo()-valor;
		setSaldo(valor2);
		System.out.println("Aguarde a contagem das cédulas!");
		System.out.println("Operação realizada!");
	}
	
}



}
