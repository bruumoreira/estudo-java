package br.com.geekuniversity.secao04;


//Operador tern�rio

//Se voc� precisar criar a fun��o main() //programa java
//main e no teclado pressionar CTRL + barra de espa�o, aparece as op��es
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
		
		//Operador tern�rio
		numero = (valor > 0) ? valor : 7;

		//se escrever sysout + CTRL + Espa�o - faz o parametro abaixo
		System.out.println(numero);

	}

}

 