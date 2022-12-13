package br.com.geekuniversity.secao07;
//Vetores parte 2

public class Vetores2 {
	public static void main(String[] args) {
		//Declaração e definição de tamanho do vetor
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		//No lugar de valor fixo, colocar o .lenght (se mudar o valor, ele continua certo
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3;
		}
		
		System.out.println(numeros[0]);//primeiro elemento
		System.out.println(numeros[9]);//ultimo elemento
		
		//0 até 9
		//numeros[10] = 42;
		//System.out.println(numeros[10]);
		/*
		 * Os vetores/arrays possuem tamanho fixo e não
		 * podem ser aumentados/diminuídos.
		 */
		
		numeros[0] = 7;
		System.out.println(numeros[0]);//primeiro elemento

		//numeros[0] = 23.4f;
		/*
		* Os vetores/arrays possuem tipos de dados fixos
		* e não aceitam tipos variados.
		*/
			
		for(int i = 0; i < numeros.length; i++) { 
			numeros[i] = (int)Math.round(Math.random() * 10);
		}
		 
		System.out.println(numeros[0]);//primeiro elemento
		System.out.println(numeros[9]);//ultimo elemento
		
		//número entre 0 e 1
		System.out.println(Math.random());
		
		//O randow escolhe um número aleatório entre 0 e 1
		System.out.println(Math.random() * 10);
		
		//O round arredonda o número
		System.out.println(Math.round(Math.random() * 10));
		
		for (int i : numeros) {
			System.out.println(i);
		}
	}

}
