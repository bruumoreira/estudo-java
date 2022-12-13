package br.com.geekuniversity.secao22;

/*/
A gente está criando nosso próprio comparador de objetos (Strings)
para que seja possível, desta forma, ordenar a string pelo seu tamanho
ao invés de ordem alfabética.

1 - A String1 é menor que a String2 -> retornamos -1
2 - A String1 é maior que a String2 -> retornamos 1
3 - A String1 tem o mesmo tamanho que a String2 -> retornamos 0

 */
import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// 1 - A String1 é menor que a String2 -> retornamos -1
		if (s1.length() < s2.length()) {
			return -1;
		}
		// 2 - A String1 é maior que a String2 -> retornamos
		if (s1.length() > s2.length()) {
			return 1;
		}
		// 3 - A String1 tem o mesmo tamanho que a String2 -> retornamos 0
		return 0;
	}

}
