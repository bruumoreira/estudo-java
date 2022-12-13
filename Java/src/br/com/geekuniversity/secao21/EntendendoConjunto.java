package br.com.geekuniversity.secao21;

//Conjuntos

/*
Uma das caracteristicas dos conjuntos � a n�o aceita��o de
elementos repetidos.

Gera performance.

A = ["Angelina", "Angela", "Adriano" ...]
B = ["B�rbara", "Beatriz", "Barnab�" ...]
C = ["C�ssia", "Camila", "Carlos" ...]
D = ["Daniela", "Daniel", "Danilo" ...]
E = ["Elis�ngela", "Elisabete", "Elias" ...]
F = ["Fabiana", "Francisca", "F�bio" ...]
.
.
.
Z = ["Zuleica", "Zagalo", "Zamael" ...]

 0  1  2  3  4  5  6  7 
[a][n][g][e][l][i][n][a]

8 / 2 -> 4
4 / 2 -> 2
2 / 2 -> 0
*/

public class EntendendoConjunto {

	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Angelina");
		System.out.println(conjunto);
		
		conjunto.adiciona("Ana");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("J�lia");
		conjunto.adiciona("Fabiana");
		conjunto.adiciona("Felicity");//N�o entra repetido
		
		conjunto.remove("J�lia");
		
		System.out.println(conjunto);
	}
}
