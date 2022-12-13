package br.com.geekuniversity.secao05;
import java.util.Scanner;

/* 
 * Receba os dados do usuário enquanto a idade for maior que 0
 */
// Do While
public class DoWhile {
		public static void main(String[] args) {
			
			int idade;
			String nome;
			
			//Para receber dados do usuário via teclado
			Scanner teclado = new Scanner(System.in);
			
			//SPrimeiro executa o bloco, depois faz a checagem
			do {
				System.out.println("Informe seu nome: ");
				nome = teclado.nextLine();
			
				System.out.println("Informe sua idade: ");
				//idade = teclado.nextInt(); // Bug
				idade = Integer.parseInt(teclado.nextLine()); //Tratamento para corrigir erro de recebimento de dados
				
				if(idade > 0) {
					System.out.println(nome + " tem " + idade + " anos");
				}
			}while(idade > 0);
			
			teclado.close();
	

		}
}