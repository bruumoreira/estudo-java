package br.com.geekuniversity.secao09;
//Classes

/*
- O nome das classes inicia com letra ma�uscula;
- O nome n�o deve conter: acentua��o, caracteres especiais, espa�o;
- Nas classes Java n�o existe a implementa��o da fun��o main();
- Toda classe Java possui a seguinte forma:
- O nome da claase Java DEVE ser o mesmo nome do arquivo java.
- Tudo o que estiver dentro das "chaves" {} faz parte da classe.

public class NomeDaClasse{

}
*/

//Atributos

/*
- S�o as caracter�sticas da classe/molde/modelo de dados;
- Podemos entender atributos como vari�veis da classe;
- Uma outra forma de nomenclatura para os atributos s�o estados;
- Atributos s�o nomeados em letras min�sculas, sem espa�o,
sem caractere especiais, sem acentua��o.
*/

//M�todos
/*
- Podemos entender o m�todo como a a��o que � realizada por um objeto da classe;
- Podemos entender tamb�m que os m�todos s�o comportamentos dos objetos da classe;

- Mesmos requisitos para fun��es
	Uma fun��o deve ter o seguinte:
	a) Tipo de retorno (Tipo de dado que a fun��o vai retornar);
	b) Nome - Corresponde a a��o que a fun��o realiza;
	c)Par�metros/Argumentos de entrada (Opcional);
	d) Retorno (Opcional - depende do tipo de retorno)
*/

public class Produto {
	String nome;
	float preco;
	float desconto;	
	
	//M�todo para aumentar o pre�o do projeto em 10
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
}
