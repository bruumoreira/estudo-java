package br.com.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
//Escrevendo em arquivos 2
//Se j� existir o arquivo, ele adiciona na linha abaixo, sen�o ele cria um arquivo novo
public class EscrevendoArquivos2 {
	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));
			
			for(int i = 0; i < 5; i++) {
			System.out.println("Escreva algo: ");
			String msg = teclado.nextLine();
			escrever.println(msg);
			}
			escrever.close();
		}catch (FileNotFoundException e) {
			System.out.println("N�o foi poss�vel criar o arquivo");
		}
		
		teclado.close();

	}

}
