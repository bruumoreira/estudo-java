package br.com.geekuniversity.secao20;
//Thread n�o sincronizada
import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;
/*
Por padr�o as threads n�o s�o sincronizadas. Pode ocorrer problemas
de uma thread acessar o valor de um objeto que ainda n�o foi atualizado
ou ainda as threads executarem depois do valor j� estar impresso.
*/

public class ThreadNaoSincronizada {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1); //Saldo 500
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start(); // 500+100 -> 600
		t2.start(); // 600+100 -> 700
		
		System.out.println(c1);
		
	}

}
