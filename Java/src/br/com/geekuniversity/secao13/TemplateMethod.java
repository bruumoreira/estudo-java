package br.com.geekuniversity.secao13;
// Template Method

/*
- O padr�o Template Method define o esqueleto de um algoritmo dentro de um m�todo,
transferindo alguns de seus passos para as subclasses. O Template Method permite
que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura
do pr�prio algoritmo.

Algoritmos s�o "receitas" passo-a-passo para resolver algum problema.

receber numero;
retornar numero * numero;

metodo principal (){
	passo1();
	passo2();
	passo3();
}

 */
public class TemplateMethod {
	public static void main(String[] args) {
		TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
		
		tit.treinoDiario();
		
		TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
		
		tft.treinoDiario();
		
	}

}
