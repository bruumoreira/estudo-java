package br.com.geekuniversity.secao19;
//Mapas / Map

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
Os mapas s�o representados em Java pela interface Map 
e mapeia seus elementos utilizando o conceito de chave/valor

- Mapas s�o conhecidos como se fossem/representassem 3 cole��es
	 - Cole��o de chaves;
	 - Cole��o de valores;
	 - Cole��o de associa��es;
 */

public class Mapas {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21, "Felicity Jones");
		pessoas.put(31, "Maria Antonieta");
		pessoas.put(41, "Angelina Jolie");
		
		//Cole��o de chaves
		System.out.println("Chaves: " + pessoas.keySet());
		
		//Cole��o de valores
		System.out.println("Valores: " + pessoas.values());
		
		//Cole��o de associa��es
		System.out.println("Associa��o: " + pessoas.entrySet());
		
		//Iterar na cole��o de chaves
		
		//Forma 1
		//Disponibilizando a partir do Java 8
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
		
		//Forma 2
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade: chaves) {
			System.out.println(pessoas.get(idade));
		}
		
		//Iterar na cole��o de valores
		
		//Forma 1
		Collection<String> valores = pessoas.values();
		for(String nome : valores) {
			System.out.println(nome);
		}
		
		//Forma 2
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		
		//Iterar a cole��o de associa��o
		
		//Forma 1
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
		//Forma 2
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});
		
	}
}
