package br.com.geekuniversity.secao04;


//If, else, else if
public class IfElseElseIf {

	public static void main(String[] args) {
		//Declarando e inicializando a vari�vel
		int numero = 9;
		
		/*
		 se(numero > 5) ent�o {
		 	escreva ("Sim, o n�mero " + numero + " � maior que 5");
		 }sen�o se(numero == 5) ent�o {
		 	escreva ("O n�mero " + numero + " � igual a 5");
		 }sen�o(numero > 5) ent�o {
		 	escreva ("N�o, o n�mero " + numero + " n�o � maior que 5");
		 }
		 */
		if (numero > 5) {
			System.out.println("Sim, o n�mero " + numero + " � maior que 5");
		}else if(numero == 5) {
			System.out.println("O n�mero " + numero + " � igual a 5");
			//Verificando se o n�mero � par
		}else if(numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � par");
		}else {
			System.out.println("N�o, o n�mero " + numero + " n�o � maior que 5");
		}
			
	}

}
