package br.com.fatec;

public class ProgramaRecursivo {

	public static void main(String[] args) {

		// Teste - Exercício 1
		System.out.println("Exercício 01: " + soma(4));

		// Teste - Exercício 2
		System.out.println("\nExercício 02: ");
		imprimePar(4);

		// Teste - Exercício 3
		System.out.println("\nExercício 03: ");
		for (int i = 0; i < 6; i++) {
			System.out.println(tribonacci(i));
		}

	}

	// Exercicio 1
	public static int soma(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return n + soma(n - 1);
		}
	}

	// Exercicio 2
	private static int imprimePar(int num) {
		if (num == - 2) {
			return 0;
		}else {
			System.out.println(num);
			return imprimePar(num - 2);
		}
		
	}

	// Exercício 3
	public static int tribonacci(int n) {
		if (n == 0 || n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		}
		return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
	}

}
