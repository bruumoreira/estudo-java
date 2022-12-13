package br.com.geekuniversity.secao12;
/*
 * Beneficios da Heran�a
	Evita a repeti��o do c�digo;	
	Facilita a manuten��o do programa;
	...
	
	- Classe espec�fica;
	- Sub-classe;
	- Classe filha
 */

/*
 * Aluno � uma pessoa
 * 
 * Quando uma classe herda de outra classe ela ganha:
 * 		TODOS os atributos e m�todos da classe herdada.
 */
public class Aluno extends Pessoa{
	private String ra;
	
	public Aluno(String nome, int ano_nascimento, String email, String ra) {
		//Pessoa(nome, ano_nascimento); //� o que o super est� fazendo
		super(nome, ano_nascimento,email);
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	//Overriding // Sobrescrita de m�todo
	public String toString() {
		return super.toString() + "\nR.A.: " + this.ra;
	}
	//Overriding // Sobrescrita de m�todo
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}

	@Override
	public void outra_mensagem(String texto) {
		System.out.println(texto);
		
	}
}