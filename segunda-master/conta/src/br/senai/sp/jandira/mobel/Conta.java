package br.senai.sp.jandira.mobel;

public class Conta {

	private String tipo;
	private double saldo;
	private String numero;
	private Cliente titular;
	private boolean ativa;
	private double chequeEspecial;
	
	
	//*** M�todos de acesso aos atributos da classe
	//*** getters and setters 
	//*** get - pegar e set- definir
	
	public void setTipo(String tipo) {
		if(tipo.equals("Corrente") || tipo.equals("Poupan�a")) {
			this.tipo = tipo;
		}
		else {
			System.out.println("O tipo deve ser Corrente ou Poupan�a");
		}
		
		
	}
	public String getTipo() {
		return this.tipo;
	}
	
	public void setCliente(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getCliente() {
		return this.titular;
	}
	
	public void setNumero(String numero) {
		this.numero= numero;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setAtiva (boolean ativa) {
			this.ativa = ativa;	
	}
	
	 public boolean isAtiva () {
		 return this.ativa; 
	 }
	public boolean getAtiva() {
		return ativa;
	}
	
	public void setChequeEspecial  ( double chequeEspecial){
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getChequeEspecial() {
		return this.chequeEspecial;
	}
	
	public void depositar(double valorDeposito) {
		
		
		if( valorDeposito < 0) {
			System.out.println("Valor inv�lido!!!");
		}
		else {
			saldo += valorDeposito;
		}
	}
	
	public void exibirSaldo() {
		
		System.out.println("Saldo :" + saldo );
		System.out.println("Saldo + limite:" + (saldo +chequeEspecial));
	}
	
	public double getSaldo(){
		return saldo;
		
	}
	
	public void transferir() {
		
	}
	public void sacar (double valorDoSaque) {
		
		if((saldo + chequeEspecial) >= valorDoSaque) {
			saldo -= valorDoSaque;
		}
		else {
			System.out.println("Saldo Insuficiente!");
		}

	}
				
}
