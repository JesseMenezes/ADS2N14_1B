package com.senac.model;
public class Conta {
	
	private double saldo;
	private int numConta;
	private int numVerificacao;
	private cliente cliente;
	
	
	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	public Conta()

	{
		
	}

    public void Depositar(double valor)
    {
    	this.saldo=this.saldo+valor;
    }

	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public int getNumConta() {
		return numConta;
	}



	public void setNumConta(int valor) {
		this.numConta = valor;
		
	}



	public int getNumVerificacao() {
		return numVerificacao;
	}



	public void setNumVerificacao(int numVerificacao) {
		this.numVerificacao = numVerificacao;
	}
	
	public void Saque(double valor)
	{
		if((saldo-valor<0))
				{
			          
			System.out.println("Saldo insufiente!!");
			
				}
		else
		{
			this.saldo=this.saldo-valor;
			System.out.println("Aguarde a contagem das c�dulas!");
			System.out.println("Opera��o realizada!");
		}
		
	}
	
	

}
