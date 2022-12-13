package br.com.geekuniversity.secao14;
//Interfaces - O que � e quando utilizar

/*
- Interfaces s�o conhecidas como "contratos".

Uma empresa criou um contrato 'com regras' para definir
a cria��o de um produto/servi�o.

Quem implementar esse contrato � OBRIGADO a seguir as regras.

O Jo�o, decidiu implementar um produto/servi�o baseado neste contrato.
A Maria, tamb�m decidiu implementar um produto/servi�o baseado no mesmo contrato.

Contrato com a confec��o de um bolo.
	- O bolo precisa ser de chocolate;
	- O bolo deve ter cobertura;
	- O bolo deve ser recheado;
	
 */
public class Interfaces {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
	Ventilador vent = new Ventilador();
	
	System.out.println("A marca do ventilador � " + vent.MARCA);
	
	vent.desligar(); //N�o deve imprimir a mensagem
	
	vent.ligar();//Deve imprimir a mensagem
	
	vent.desligar();//Deve imprimir a mensagem
	
	}
}
