package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes An�nimas

/*
Classes an�nimas s�o classes sem nome. 

Quando utilizar?

- Utilizamos classes an�nimas quando temos interfaces com um
ou poucos m�todos e n�o precisamos reaproveitar o c�digo da classe.

Ou seja, se n�o iremos precisar reaproveitar a classe em um outro lugar
do nosso sistema e esta classe que eu deveria criar iria apenas implementar
uma interface com um ou poucos m�todos, podemos utilizar o conceito de 
classe an�nima.
*/
public class ClassesAnonimas {

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

		Consumer<String> consumidor = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};

		palavras.forEach(consumidor);

	}
}
