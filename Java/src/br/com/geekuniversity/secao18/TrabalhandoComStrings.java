package br.com.geekuniversity.secao18;
//Trabalhando com Strings
/*
EM Java, Strings s�o imut�veis, ou seja, n�o mudam.
*/
public class TrabalhandoComStrings {

	public static void main(String[] args) {
		String curso = "Programa��o em Java: Essencial";
		
		//curso = curso.replace("Java", "Python");//Altera na string, se encontrar, a primeira palavra pela segunda	
		
		//curso = curso.toLowerCase();//Converte as letras ma�usculas para min�sculas
		
		//curso = curso.toUpperCase();//Converte as letras min�sculas para ma�usculas
		
		//System.out.println(curso);
		
		//System.out.println(curso.charAt(0));
		
//		for(int i = 0; i < curso.length(); i++) {
//			System.out.print(curso.charAt(i));
//		}
		
		for(int i = (curso.length() -1); i >= 0; i--) {
			System.out.print(curso.charAt(i));//Inverte a escrita de tr�s para frente
		}
	}

}
