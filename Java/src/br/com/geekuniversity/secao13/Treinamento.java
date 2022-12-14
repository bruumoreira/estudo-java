package br.com.geekuniversity.secao13;
//Template Method

/*
- Final ? um modificador de acessi que faz com que
o elemento que esteja utilizando, n?o possa ser extendido/reescrito.
 */
public abstract class Treinamento {
	
	//Template method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino t?tico...");
	}

}
