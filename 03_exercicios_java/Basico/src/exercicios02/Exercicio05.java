package exercicios02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Digite um inteiro maior que 0: ");
			numero = scanner.nextInt();
		} while (numero < 1);
		
		somarAlgarismos(numero);
		
		scanner.close();
	}
	
	public static void somarAlgarismos(int valor) {
		int soma = 0, aux = valor;
		while (aux > 0) {
			soma += aux % 10;
			aux /= 10;
		}
		
		System.out.println("A soma dos algarismos de '" + valor + "' é " + soma);
	}

}
