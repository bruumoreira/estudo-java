package br.com.geekuniversity.secao06;
//Opera��es Matem�ticas
public class OperacoesMatematicas {
	public static void main(String[] args) {
		int num1 = 5, num2 = 9, res;
		float res2;
		
		//Soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " � " + res);				
		
		//Subtra��o
		res = num1 - num2;
		System.out.println("A subtra��o de " + num1 + " - " + num2 + " � " + res);
		
		//Multiplica��o
		res = num1 * num2;
		System.out.println("A multiplica��o de " + num1 + " * " + num2 + " � " + res);
		
		//Divis�o (Inteira)
		res = num2 / num1;
		System.out.println("A divis�o de " + num2 + " / " + num1 + " � " + res);
		
		//Divis�o (Real)
		res2 = (float)num2 / (float)num1;//Cast
		System.out.println("A divis�o de " + num2 + " / " + num1 + " � " + res2);

		//M�dulo
		/*
		 * Se o resto do m�dulo da vari�vel por 2 for 0, a vari�vel
		 * � par. Se o resto for 1, a vari�vel � �mpar.
		 */
		res = num1 % 2;
		System.out.println("O resto da divis�o de " + num1 + " por 2 � " + res);
		
		res = num2 % 3;
		System.out.println(num2 + " � divis�vel por 3? " + res);
			
	}
}
