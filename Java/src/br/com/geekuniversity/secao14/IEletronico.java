package br.com.geekuniversity.secao14;
/*
Uma interface pode conter:
	- Constantes(define em letras maiusculas);
	- M�todos abstratos;
	
Interface para servir de contrato para produtos eletr�nicos. Todo
produto eletr�nico que implementar essa interface OBRIGATORIAMENTE
dever�o implementar os m�todos abstratos.
 */
public interface IEletronico {
	
	public String MARCA = "Geek"; //Constante
	
	public void ligar();
	
	public void desligar();

}
