package br.com.estrutura.atribuicao;

public class AtribuicaoReferencia {

	public static void main(String[] args) {
		 int a = 1, b = a; // copiou o valor
		 
		 System.out.println("a = " + a + "\nb = " + b); // 1 e 1
		 
		 a = 2;
		 
		 System.out.println("a = " + a + "\nb = " + b); // 2 e 1
		 
		 Objeto objA = new Objeto(1);
		 Objeto objB = objA; // atribuiu a referência de memória | objA objB tem o mesmo endereço de memória
		 
		 System.out.println("objA = " + objA + "\nobjB = " + objB); // 1 e 1
		 
		 objA.setNumero(2);
		 System.out.println("objA = " + objA + "\nobjB = " + objB); // 2 e 2
	}

}
