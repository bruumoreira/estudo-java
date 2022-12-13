package br.com.geekuniversity.secao04;


//If, else, else if
public class IfElseElseIf {

	public static void main(String[] args) {
		//Declarando e inicializando a variável
		int numero = 9;
		
		/*
		 se(numero > 5) então {
		 	escreva ("Sim, o número " + numero + " é maior que 5");
		 }senão se(numero == 5) então {
		 	escreva ("O número " + numero + " é igual a 5");
		 }senão(numero > 5) então {
		 	escreva ("Não, o número " + numero + " não é maior que 5");
		 }
		 */
		if (numero > 5) {
			System.out.println("Sim, o número " + numero + " é maior que 5");
		}else if(numero == 5) {
			System.out.println("O número " + numero + " é igual a 5");
			//Verificando se o número é par
		}else if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é par");
		}else {
			System.out.println("Não, o número " + numero + " não é maior que 5");
		}
			
	}

}
