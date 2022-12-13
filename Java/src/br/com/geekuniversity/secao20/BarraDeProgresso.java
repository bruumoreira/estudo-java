package br.com.geekuniversity.secao20;
/*
Para executar m�todos em paralelo, nossa classe
deve implementar a interface Runnable, e o m�todo
que precisar ser executado em paralelo deve
ser executado dentro do m�todo run
*/
public class BarraDeProgresso implements Runnable{
	
	public void executa() {
		//For 0 at� 1 mil
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + " - Barra de progresso ... aguarde");
		}
	}

	@Override
	public void run() {
		//For 0 at� 1 mil
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + " - Barra de progresso ... aguarde");
			}
		}
}