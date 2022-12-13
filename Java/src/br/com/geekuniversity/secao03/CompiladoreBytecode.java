package br.com.geekuniversity.secao03;


public class CompiladoreBytecode {
	

	public static void main(String[] args) {
		int idade = 28;
		
		System.out.println("Eu tenho " + idade + " anos");
		
		// javac Programa.java -> Programa.class -> java Programa
		//Código fonte (Programa.java) -> bytecode (Programa.class) -> executável
	}
}
