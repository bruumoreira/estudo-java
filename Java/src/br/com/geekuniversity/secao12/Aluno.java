package br.com.geekuniversity.secao12;
/*
 * Beneficios da Herança
	Evita a repetição do código;	
	Facilita a manutenção do programa;
	...
	
	- Classe específica;
	- Sub-classe;
	- Classe filha
 */

/*
 * Aluno é uma pessoa
 * 
 * Quando uma classe herda de outra classe ela ganha:
 * 		TODOS os atributos e métodos da classe herdada.
 */
public class Aluno extends Pessoa{
	private String ra;
	
	public Aluno(String nome, int ano_nascimento, String email, String ra) {
		//Pessoa(nome, ano_nascimento); //É o que o super está fazendo
		super(nome, ano_nascimento,email);
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	//Overriding // Sobrescrita de método
	public String toString() {
		return super.toString() + "\nR.A.: " + this.ra;
	}
	//Overriding // Sobrescrita de método
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}

	@Override
	public void outra_mensagem(String texto) {
		System.out.println(texto);
		
	}
}