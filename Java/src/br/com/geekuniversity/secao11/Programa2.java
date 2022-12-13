package br.com.geekuniversity.secao11;
//Private

/*
Privado à própria classe;

ou seja, só temos acesso ao atributo ou método privado
dentro da própria classe onde ele foi declarado.
*/
public class Programa2 {
	public static void main(String[] args) {
		
	Cliente cli1 = new Cliente(24, "Felicity Jones", "Rua qualquer, 123");
	
	System.out.println("Nome: " + cli1.getNome());
	System.out.println("Endereço: " + cli1.getEndereco());
	cli1.dizer_oi();
	
	Cliente cli2 = new Cliente(37, "Angelina Julie", "Rua outra, 345");
	
	System.out.println("Nome: " + cli2.getNome());
	System.out.println("Endereço: " + cli2.getEndereco());
	cli2.dizer_oi();
	
	}
}
