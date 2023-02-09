package modulo13;

import java.util.Scanner;

public class Programa {

	public static void main(String args[]) {
		

		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome("Ricardo Couro");
		pessoaJuridica.setEndereco("Rua 1, 1");
		pessoaJuridica.setTelefone("(11)11111-1111");
		pessoaJuridica.setCnpj("54.229.919-0001/80");
		
		System.out.println("Nome: " + pessoaJuridica.getNome() + " Endereço: " + pessoaJuridica.getEndereco() + " Telefone: " + pessoaJuridica.getTelefone() + " CPF " + pessoaJuridica.getCnpj());
		
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setNome("Ricardo Yoshio");
		pessoa.setEndereco("Rua2, 2");
		pessoa.setTelefone("(22)22222-2222");
		pessoa.setCpf("111.111.111-11");
		
		System.out.println("Razão Social: " + pessoa.getNome() + " Endereço: "  + pessoa.getEndereco() + " Telefone: " + pessoa.getTelefone() + " CPF: " + pessoa.getCpf());
		

	}

}
