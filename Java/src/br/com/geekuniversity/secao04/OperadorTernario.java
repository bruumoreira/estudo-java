package br.com.geekuniversity.secao04;


//Operador ternário

//Se você precisar criar a função main() //programa java
//main e no teclado pressionar CTRL + barra de espaço, aparece as opções
public class OperadorTernario {
	
	public static void main(String[] args) {
		int valor = 3, numero;
		
		/*
		if(valor > 0) {
			numero  = valor;
		}else {
			numero = 7;
		}
		*/
		
		//Operador ternário
		numero = (valor > 0) ? valor : 7;

		//se escrever sysout + CTRL + Espaço - faz o parametro abaixo
		System.out.println(numero);

	}

}

 