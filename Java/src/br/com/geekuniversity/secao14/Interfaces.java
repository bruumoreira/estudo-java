package br.com.geekuniversity.secao14;
//Interfaces - O que é e quando utilizar

/*
- Interfaces são conhecidas como "contratos".

Uma empresa criou um contrato 'com regras' para definir
a criação de um produto/serviço.

Quem implementar esse contrato é OBRIGADO a seguir as regras.

O João, decidiu implementar um produto/serviço baseado neste contrato.
A Maria, também decidiu implementar um produto/serviço baseado no mesmo contrato.

Contrato com a confecção de um bolo.
	- O bolo precisa ser de chocolate;
	- O bolo deve ter cobertura;
	- O bolo deve ser recheado;
	
 */
public class Interfaces {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
	Ventilador vent = new Ventilador();
	
	System.out.println("A marca do ventilador é " + vent.MARCA);
	
	vent.desligar(); //Não deve imprimir a mensagem
	
	vent.ligar();//Deve imprimir a mensagem
	
	vent.desligar();//Deve imprimir a mensagem
	
	}
}
