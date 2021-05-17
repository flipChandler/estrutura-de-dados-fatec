package br.com.felipe.exercicio;

public class TesteTipo2 {

	public static void main(String[] args) {
		
		// 2. Considere as seguintes atribuições em Java
		
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = 0.1234;
		
		float resultado1 = f * b;
		System.out.println(resultado1);
		
		// a) f * b retorna um float, no valor de 238.14
		
		int resultado2 = i / c;
		System.out.println(resultado2);
		// b) i / c retorna um int de 515, sendo que o char c, converte o 'a' para 97, que é o valor dele na tabela ASCII, ou seja, 50000 / 97
		
		float resultado3 = (f * b) + (i / c); // c) soma o float com o int, retornando um float de 753,14
		System.out.println(resultado3); 
		
		double resultado4 = d * s;
		System.out.println(resultado4); // d) retorna um double de 126.3616
		
		double resultado5 = (f * b) + (i / c) - (d * s);
		System.out.println(resultado5); // retorna um double de 626.778414
		
	}

}
