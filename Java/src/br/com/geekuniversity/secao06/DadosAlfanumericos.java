package br.com.geekuniversity.secao06;
//Tipos de dados alfanuméricos
//caracteres e strings
public class DadosAlfanumericos {
	public static void main(String[] args) {
		//Tipos primitivos
		char letra1 = 'a';
		char letra2 = 97;// 97 em decimal == 'a'
		//char letra4 = "b"; //Errado, precisa ser 'aspas simples'
		//string nome = "asssad"; Não existe o tipo primitvo string em Java
		
		System.out.println("Letra2 " + letra2);
		
		letra2 = (char) (letra2 + 1);
		
		System.out.println("Letra1 " + letra1);
		System.out.println("Letra2 " + letra2);
		
		//Tipos não primitivos
		Character letra3 = 'A';
		String nome = "Geek University";
		
		System.out.println("Letra3 " + letra3);
		
		System.out.println("char/Character " + Character.SIZE + " bits");
		
		System.out.println("Valor min char/Character " + Character.MIN_VALUE);//0
		System.out.println("Valor min char/Character " + Character.MAX_VALUE);//65535
		
		System.out.println("Nome " + nome);
		
		System.out.println("Tamanho da String: " + nome.length());
		
		System.out.println("String " + (Character.SIZE * nome.length()) + " bits");
		
	}

}
