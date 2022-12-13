package br.com.geekuniversity.secao06;
//Tipos de dados
//Numéricos (Inteiros e Reais)
public class NumerosReais {
	
	public static void main(String[] args) {
		//Tipos primários/primitivos
		//Por padrão, os números reais em Java são considerados double
		float preco1 = 23.4f; //23.40
		double preco2 = 23.4; //23.43456345634563456345634563456345634
		
		//Tipos não primários/primitivos
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float -> preco1 = " + preco1);
		System.out.println("double -> preco2 = " + preco2);
		System.out.println("Float -> preco3 = " + preco3);
		System.out.println("Double -> preco4 = " + preco4);
		
		System.out.println("float/Float " + Float.SIZE + " bits");//Visualizar o tamanho do arquivo
		System.out.println("double/Double " + Double.SIZE + " bits");
	
		System.out.println("Valor min float/Float " + Float.MIN_VALUE);// Visualizar o tamanho minimo
		System.out.println("Valor min float/Float " + Float.MAX_VALUE);// Visualizar o tamanho máximo
		
		System.out.println("Valor min double/Double " + Double.MIN_VALUE);
		System.out.println("Valor min double/Double " + Double.MAX_VALUE);
		
	}
	
}
