package br.com.geekuniversity.secao07;
//Vetores parte 2

public class Vetores2 {
	public static void main(String[] args) {
		//Declara��o e defini��o de tamanho do vetor
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		//No lugar de valor fixo, colocar o .lenght (se mudar o valor, ele continua certo
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3;
		}
		
		System.out.println(numeros[0]);//primeiro elemento
		System.out.println(numeros[9]);//ultimo elemento
		
		//0 at� 9
		//numeros[10] = 42;
		//System.out.println(numeros[10]);
		/*
		 * Os vetores/arrays possuem tamanho fixo e n�o
		 * podem ser aumentados/diminu�dos.
		 */
		
		numeros[0] = 7;
		System.out.println(numeros[0]);//primeiro elemento

		//numeros[0] = 23.4f;
		/*
		* Os vetores/arrays possuem tipos de dados fixos
		* e n�o aceitam tipos variados.
		*/
			
		for(int i = 0; i < numeros.length; i++) { 
			numeros[i] = (int)Math.round(Math.random() * 10);
		}
		 
		System.out.println(numeros[0]);//primeiro elemento
		System.out.println(numeros[9]);//ultimo elemento
		
		//n�mero entre 0 e 1
		System.out.println(Math.random());
		
		//O randow escolhe um n�mero aleat�rio entre 0 e 1
		System.out.println(Math.random() * 10);
		
		//O round arredonda o n�mero
		System.out.println(Math.round(Math.random() * 10));
		
		for (int i : numeros) {
			System.out.println(i);
		}
	}

}
