package br.senai.sp.jandira;

import br.senai.sp.jandira.mobel.Cliente;
import br.senai.sp.jandira.mobel.Conta;

public class App2 {

	public static void main(String[] args) {
		//Cria��o do Cliente
		Cliente pedro = new Cliente();
		 pedro.setNome("Pedro �lvares Cabral");
		 pedro.setCpf("50413198824");
		 pedro.setTelefone("(11) 97162-4429");
		 pedro.setCep("06380100");
		 
		 
		 //Criar da conta do Pedro
		 
		 Conta contaPedro = new Conta();
		 contaPedro.setCliente(pedro);
		 contaPedro.depositar(100);
		 contaPedro.setNumero("2222-2");
		 
		 System.out.println(contaPedro.getCliente().getTelefone());
		 System.out.println(contaPedro.getCliente().getNome());
		 contaPedro.getCliente().setNome("Pedro da Silva");
		 System.out.println(contaPedro.getCliente().getNome());
	}

}
