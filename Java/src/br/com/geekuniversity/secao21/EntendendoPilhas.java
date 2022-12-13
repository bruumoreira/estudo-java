package br.com.geekuniversity.secao21;
//Pilhas

/*
S�o estruturas de dados onde o elemento que est� vis�vel/dispon�vel � o que
est� sempre no topo.

Os elementos, ao serem adicionados em uma pilha, s�o adicionados sempre no topo.

Para remover elementos da pilha, s� podemos remover o topo.

O primeiro elemento a entrar � o ultimo a sair. 

O ultimo elemento a entrar � o primeiro a sair

[4] -> tem visibilidade
[3]
[2]
[1]
[0]
 */
public class EntendendoPilhas {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();

		System.out.println(pilha);

		pilha.insere("Angelina");
		pilha.insere("Felicity");
		System.out.println(pilha);
		
		String ret = pilha.pegaTopo();
		System.out.println(ret);

		String r1 = pilha.remove();
		System.out.println(r1);

		System.out.println(pilha);

		pilha.remove();
		System.out.println(pilha.vazia());
		

	}
}
