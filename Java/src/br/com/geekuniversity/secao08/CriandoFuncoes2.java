package br.com.geekuniversity.secao08;
//Fun??es
public class CriandoFuncoes2 {
	public static void main(String[] args) {
		int valor1 = 6, valor2 = 4; //, res;
		
		//res = soma(valor1, valor2);
		
		//System.out.println("O resultado ? " + res);
		
		System.out.println("O resultado ? " + soma(valor1, valor2, "Ol?"));
		
		System.out.println(mensagem());
	}

	static int soma(int v1, int v2, String msg) {
		System.out.println(msg);
		return v1 + v2;
	}
	
	static String mensagem() {
		return "Ol? usu?rio";
	}
}
