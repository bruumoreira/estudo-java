package br.com.geekuniversity.secao12;
/*
- Classe base
- Classe m�e
- Classe pai
- Super classe
- Classe gen�rica
*/
//Agora como classe abstrata
/*
 Desta forma, impossibilitamos a cria��o de objetos desta classe
 
 Uma classe abstrata pode ter:
 	- atributos;
 	- m�todos;
 	- m�todos abstratos;
 	
 M�todos abstratos: 
 	S�o m�todos, que n�o possuem implementa��o, possuem apenas
 	declara��o, e, obrigatoriamente, as classes que herdem desta
 	classe com m�todo abstrato, precisa implementar esses m�todos.
 */
public abstract class Pessoa {
	private String nome;
	private int ano_nascimento;
	private String email;
	
	public Pessoa() {}
	
	public Pessoa(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return this.ano_nascimento;
	}
	public void setAnoNascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Overriding // Sobrescrita de m�todo
	public String toString() {
		return "Nome: " + this.nome + "\nAno Nascimento: " + this.ano_nascimento;
	}
	//Overloading // Sobrecarga de M�todo
	public void mensagem() {
		System.out.println("Esta � a minha mensagem...");
	}
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	public void mensagem(String msg, int num) {
		System.out.println(msg + num);
	}
	
	//Declara��o de um m�todo abstrato
	public abstract void outra_mensagem(String texto);
}