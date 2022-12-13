package br.com.geekuniversity.secao05;
import java.util.ArrayList;
import java.util.List;


//Foreach
public class ForEach {
	public static void main(String[] args) {
		test();
		String nome = "Geek University";
		
		// Para cada um dos caracteres da string, imprima o caractere
		for (char letra : nome.toCharArray()) {
			System.out.println(letra);
			//System.out.print(letra);
			
		}
	}
	
	private static void test() {
		List<String> lista = new ArrayList<String>();
		lista.add("Leonardo");
		lista.add("Bruna");
		
		lista.forEach(item -> System.out.println(item));
		
		for (String item : lista) {
			System.out.println(item);
		}
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
	}

}
