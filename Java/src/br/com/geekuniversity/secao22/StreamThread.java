package br.com.geekuniversity.secao22;
//Stream + Thread (paralelismo)

/*
�til, quando estamos trabalhando com milh�es/bilh�es de dados.

N�O � recomendado para quantidade pequena de dados.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamThread {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programa��o para Leigos", 170));
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o: Essencial", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em Java: Essencial", 0));
		cursos.add(new Curso("Programa��o em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		cursos.parallelStream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c -> c.getAlunos()))
		.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

	}

}
