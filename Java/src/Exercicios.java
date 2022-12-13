import java.util.Scanner;

public class Exercicios {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero;
		
		
		System.out.println("Informe um número: ");
		numero = Integer.parseInt(teclado.nextLine());
		
		teclado.close();
		
		System.out.println("\n Dobro do número = " + numero * 2);
	}
	
	
}
