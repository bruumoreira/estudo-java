package br.com.geekuniversity.secao06;
//Tipos booleanos
public class TiposBooleanos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
		//Tipos n�o primitivos
		Boolean v = true;
		Boolean f = false;
		
		boolean ativo = true;
		
		System.out.println("Verdadeiro " + verdadeiro);
		System.out.println("Falso " + falso);
		System.out.println("V " + v);
		System.out.println("F " + f);
		
		//System.out.println("boolean/Boolean " + Boolean.SIZE); N�o tem porque seria 0 ou 1
		
		if(verdadeiro) {
			System.out.println("� Verdadeiro");
		}else {
			System.out.println("� Falso");
		}
		
		if(1 == 3) {
			System.out.println("1 == 1 � Verdadeiro");
		}else {
			System.out.println("... � falso");
		}
		
		if(ativo) {
			System.out.println("Pode acessar o sistema");
		}else {
			System.out.println("Acesso negado");
		}
	}
}