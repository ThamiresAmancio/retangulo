package br.senai.sp.jandira;

import br.senai.sp.jandira.mobel.Cliente;
import br.senai.sp.jandira.mobel.Conta;

public class App {

	public static void main(String[] args) {
		
		Conta contaAnaGomes = new Conta ();
		Conta contaPedro = new Conta();
		
		 /*Conta da Ana*/
		
		/*contaAnaGomes.setTitular("Ana Gomes");*/
		contaAnaGomes.setNumero("111-98"); 
		contaAnaGomes.setTipo("Poupan�a");
		contaAnaGomes.setAtiva(true);
		contaAnaGomes.setChequeEspecial(200);
		contaAnaGomes.depositar(100);
		contaAnaGomes.exibirSaldo();
		contaAnaGomes.depositar(30);
		contaAnaGomes.exibirSaldo();
		contaAnaGomes.sacar(50);
		contaAnaGomes.exibirSaldo();
		contaAnaGomes.sacar(500);
		contaAnaGomes.exibirSaldo();
		contaAnaGomes.sacar(50);
		contaAnaGomes.exibirSaldo();
		contaAnaGomes.sacar(80);
		contaAnaGomes.exibirSaldo();
		contaAnaGomes.depositar(100);
		contaAnaGomes.exibirSaldo();
		contaAnaGomes.getSaldo();
		
	
		double a = contaAnaGomes.getSaldo();
		System.out.println("******" + contaAnaGomes.getSaldo());
		
		/*System.out.println(contaAnaGomes.getTitular());*/
		System.out.println(contaAnaGomes.getTipo());
		System.out.println(contaAnaGomes.getNumero());
		System.out.println(contaAnaGomes.getChequeEspecial());
		System.out.println(contaAnaGomes.getAtiva());
		
		
	}
	
	

}
