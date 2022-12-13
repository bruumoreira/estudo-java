package br.com.geekuniversity.secao22;
//Default Methods

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Default Methods -> S�o m�todos concretos implementados em
interfaces. Estes m�todos, como s�o concretos, ou seja,
j� possuem implementa��o, n�o precisam ser implementados
nas classes que implementarem esta interface.

Novidade implementada a partir da vers�o 8 do Java

Atualmente, estamos na vers�o 10 do Java.
*/
@SuppressWarnings("unused")
public class DefaultMethods {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("OutLast 2");
		
		//Collections.sort(palavras, comparador); 
		
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
		
	}
}
