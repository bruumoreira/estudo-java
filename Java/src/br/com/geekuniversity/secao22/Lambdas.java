package br.com.geekuniversity.secao22;
//Lambdas

/*
Express�es lambdas, s�o fun��es an�nimas. 

Atalho do Eclipse para identa��o do c�digo (Organiza��o do c�digo) -> CTRL + Shift + f
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambdas {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		Comparator<String> comparador = new ComparadorPorTamanho();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("OutLast 2");

		palavras.sort(comparador);

		// Express�o lambda - forma 1
//		palavras.forEach (String s) -> {
//			System.out.println(s);
//		});

		// Express�o lambda - forma 2
		palavras.forEach(s -> System.out.println(s));
	}
}
