package br.com.geekuniversity.secao22;
//Streams

import java.util.ArrayList;
import java.util.List;

/*
Streams s�o fluxos de dados/objetos utilizados para que possamos
trabalhar com esses dados de forma mais criteriosa.

- Quando trabalhamos com stream, os m�todos aplicados a este stream
n�o afeta a cole��o original.
*/

public class Streams {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programa��o para Leigos", 170));
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o: Essencial", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em Java: Essencial", 0));
		cursos.add(new Curso("Programa��o em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));

		// Como fazer para imprimir somente os cursos com mais de 100 alunos?
		// cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c ->
		// System.out.println(c.getNome()));
		// 1 - Transformando a cole��o de cursos em stream
		cursos.stream()
		// 2 - Aplicamos o filtro onde os cursos com 100 ou mais alunos
		.filter(c -> c.getAlunos() >= 100)
		// 3 - Imprimimos o resultado
		.forEach(System.out::println);

	}

}
