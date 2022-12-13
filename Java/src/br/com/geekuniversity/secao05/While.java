package br.com.geekuniversity.secao05;
import java.util.Scanner;

/* 
 * Receba os dados do usu�rio enquanto a idade for maior que 0
 */

//While 
public class While {
	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//Para receber dados do usu�rio via teclado
		Scanner teclado = new Scanner(System.in);
		
		//Sempre checa o valor antes de executar o bloco
		while(idade > 0) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
		
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); // Bug
			idade = Integer.parseInt(teclado.nextLine()); //Tratamento para converter string para inteiro
		
			System.out.println(nome + " tem " + idade + " anos");
		
		}
		
		teclado.close();
	
	}

}
