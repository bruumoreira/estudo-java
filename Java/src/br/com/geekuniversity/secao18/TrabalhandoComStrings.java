package br.com.geekuniversity.secao18;
//Trabalhando com Strings
/*
EM Java, Strings são imutáveis, ou seja, não mudam.
*/
public class TrabalhandoComStrings {

	public static void main(String[] args) {
		String curso = "Programação em Java: Essencial";
		
		//curso = curso.replace("Java", "Python");//Altera na string, se encontrar, a primeira palavra pela segunda	
		
		//curso = curso.toLowerCase();//Converte as letras maíusculas para minúsculas
		
		//curso = curso.toUpperCase();//Converte as letras minúsculas para maíusculas
		
		//System.out.println(curso);
		
		//System.out.println(curso.charAt(0));
		
//		for(int i = 0; i < curso.length(); i++) {
//			System.out.print(curso.charAt(i));
//		}
		
		for(int i = (curso.length() -1); i >= 0; i--) {
			System.out.print(curso.charAt(i));//Inverte a escrita de trás para frente
		}
	}

}
