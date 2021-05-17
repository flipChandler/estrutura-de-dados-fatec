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
		 *  R: a vari�vel int d consegue armazenar o resultado da equa��o das vari�veis de tipo de byte, em raz�o do tamanho de int que equivale a 4 bytes.
		 *  Por�m, o byte d n�o � possivel receber o resultado da equa��o das vari�veis de tipo byte, por uma quest�o de design da pr�pria linguagem, que retorna
		 *  int, qualquer opera��o realizada com byte 
		 *  Se alterarmos: a=4, b=5, c=10, muda alguma coisa? O resultado ainda retorna int. 
		 */
				
				
		byte e = 50;
		//byte f = e * 6;
		
		// em f, foi o valor esperado? R: O c�digo nem compilou, pois, qualquer c�lculo envolvendo byte, retorna int, n�o sendo compat�vel com o typo byte de f
		
	}

}
