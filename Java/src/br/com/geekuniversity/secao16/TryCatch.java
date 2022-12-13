package br.com.geekuniversity.secao16;

import java.util.Scanner;

public class TryCatch {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Informa o primeiro n�mero para divis�o: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Informa o segundo n�mero para divis�o: ");
		int num2 = teclado.nextInt();
		
		try {
		System.out.println("A divis�o de " + num1 + " por " + num2 + " � " + num1/num2);
		}catch (ArithmeticException e) {
			System.out.println("N�o � poss�vel dividir " + num1 + " por " + num2);
		}
		
		System.out.println("Fa�a isso tamb�m . . .");
		
		teclado.close();
	}

}
