package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	private List<String> nomes = new LinkedList<String>();

	/**
	 * Em uma pilha, inserimos elementos sempre no topo.
	 * 
	 * @param nome
	 * 
	 * Na implementa��o do Java para pilhas (Stack) este
	 * m�todo chama-se push.
	 */
	public void insere(String nome) {
		this.nomes.add(nome);
	}

	/**
	 * Em uma pilha, removemos sempre o elemento que est� no topo.
	 * 
	 * @return
	 * 
	 * Na implementa��o do Java para pilhas (Stack) este
	 * m�todo chama-se pop.
	 */
	public String remove() {
		try {
			return nomes.remove(nomes.size() - 1);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("A pilha j� est� vazia.");
			return "";
		}
	}
	
	public String pegaTopo() {
		return nomes.get(nomes.size() - 1);
	}

	public boolean vazia() {
		return nomes.size() == 0;
	}

	@Override
	public String toString() {
		return this.nomes.toString();
	}

}
