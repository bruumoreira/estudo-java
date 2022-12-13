package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("Outlast 2");
		
		palavras.forEach(consumidor);
		
		
	}

}
