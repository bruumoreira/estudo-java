package br.com.geekuniversity.secao21;

import br.com.geekuniversity.secao11.Cliente;

// Lista ligada / LinkedList

/*
Em um vetor, os elementos est�o um do lado do outro, enquanto em uma lista
ligada, eles est�o em lugares diferentes, por�m um aposta para o outro
indicando o pr�ximo elemento.

[0][3][1][2][5][4][null]

[1, 2, 3, ]
 */
public class Lista {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

		System.out.println(lista);
		
		lista.adiciona("Angelina");
		System.out.println(lista);
		lista.adiciona("Maria");
		System.out.println(lista);
	
		lista.remove(0);
		System.out.println(lista);
		
		System.out.println(lista.contem("Angelina"));
	}

}
