package br.com.felipe.exercicio;

public class TesteTipo {

	public static void main(String[] args) {
		byte a = 40;
		byte b = 50;
		byte c = 100;
		//int d = a * b / c;
		byte d = (byte) (a - b);
		
		/*
		 *  1) o que acontece em d e e?
		 *  R: a variável int d consegue armazenar o resultado da equação das variáveis de tipo de byte, em razão do tamanho de int que equivale a 4 bytes.
		 *  Porém, o byte d não é possivel receber o resultado da equação das variáveis de tipo byte, por uma questão de design da própria linguagem, que retorna
		 *  int, qualquer operação realizada com byte 
		 *  Se alterarmos: a=4, b=5, c=10, muda alguma coisa? O resultado ainda retorna int. 
		 */
				
				
		byte e = 50;
		//byte f = e * 6;
		
		// em f, foi o valor esperado? R: O código nem compilou, pois, qualquer cálculo envolvendo byte, retorna int, não sendo compatível com o typo byte de f
		
	}

}
