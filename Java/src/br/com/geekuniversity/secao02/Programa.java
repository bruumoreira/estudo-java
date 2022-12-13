package br.com.geekuniversity.secao02;
/* 
Public


Publico - pode ser utilizado em todo o projeto.
*/
import br.com.geekuniversity.secao11.Cliente;

public class Programa {

	public static void main(String[] args) {
		Cliente cli = new Cliente(46,"Angelina Jolie", "Rua da barra, 256");
		
		//System.out.println("Nome: " + cli.nome);//Private
		//System.out.println("Endereço: " + cli.endereco);//private

		//cli.dizer_oi();
		
		System.out.println(cli.hashCode());
	}

}
