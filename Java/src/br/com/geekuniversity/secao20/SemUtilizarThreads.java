package br.com.geekuniversity.secao20;
//Simula��o da gera��o de relat�rio + barra de tarefa
//sem a utiliza��o de threads

public class SemUtilizarThreads {
	
	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		relatorio.executa();
		
	}
}
