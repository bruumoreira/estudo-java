package br.com.geekuniversity.secao09;
//Objetos

/*
- Objetos s�o produtos/inst�ncias da classe;
*/
public class Programa {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int numero = 4;
		
		//Declara��o de um objeto
		Produto p0;
		
		//Declara��o e instancia��o/inicia��o do objeto
		//p1 -> inst�ncia do objeto / objeto
		Produto p1 = new Produto(); // Construtor
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("===========Produtos===========");
		System.out.println(p1.nome);
		System.out.println("R$ " + p1.preco);
		System.out.println(p1.desconto + " %");
		System.out.println("");
		
		p0 = new Produto(); // Construtor
		p0.nome = "Caneta Bic";
		p0.preco = 2.45f;
		p0.desconto = 5.0f;
		
		System.out.println(p0.nome);
		System.out.println("R$ " + p0.preco);
		System.out.println(p0.desconto + " %");
		
		Pessoa pessoa1 = new Pessoa(); // Construtor
		pessoa1.nome = "Bruna Stefani";
		pessoa1.email = "stefani@gmail.com";
		pessoa1.ano_nascimento = 1994;
		
		System.out.println("============Pessoas============");
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("E-mail: " + pessoa1.email);
		System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);
		
	}

}
