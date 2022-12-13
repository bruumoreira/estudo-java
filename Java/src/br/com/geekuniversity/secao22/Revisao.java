package br.com.geekuniversity.secao22;
//Revis�o

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 - Classes an�nimas;
 - Lambdas;
 - Method References;
 
*/
public class Revisao {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programa��o para Leigos", 170));
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o: Essencial", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em Java: Essencial", 0));
		cursos.add(new Curso("Programa��o em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));

		// cursos.sort(Comparator.comparing(c -> c.getAlunos())); //Lambda
		cursos.sort(Comparator.comparing(Curso::getAlunos)); // Method References

		// cursos.forEach(c -> System.out.println(c.getNome())); //Lambda
		cursos.forEach(System.out::println);// Method References

	}

}
