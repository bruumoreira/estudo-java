package br.com.geekuniversity.secao09;
//Construtor
/*
- O construtor de uma classe SEMPRE tem o mesmo nome da classe;
- Por padrão a JVM (Java Virtual Machine), cria em tempo de execução,
um construtor padrão - um construtor vazio; 
- Podemos ter mais de um construtor na classe;
*/
public class Construtor {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.ano_nascimento = 1986;
		
		pessoa1.imprime_informacoes();
		
		//Substituido por pessoa1.imprime_informacoes();
		/*System.out.println("Nome: " + pessoa1.nome);
		System.out.println("E-mail: " + pessoa1.email);
		System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);
		System.out.println();*/
		
		Pessoa pessoa2 = new Pessoa("Bruna Stefani", "stefani@gmail.com", 1994);
		pessoa2.imprime_informacoes();
		
		//Substituido por pessoa2.imprime_informacoes();
		/*System.out.println("Nome: " + pessoa2.nome);
		System.out.println("E-mail: " + pessoa2.email);
		System.out.println("Ano de Nascimento: " + pessoa2.ano_nascimento);*/
		

	}

}
