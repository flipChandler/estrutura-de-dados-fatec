import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Ler um número inteiro e dizer se ele é par ou ímpar.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = scanner.nextInt();
		
		String parOuImpar = num % 2 == 0 ? "par" : "impar";
		
		System.out.println(num + " é " + parOuImpar);
		
		scanner.close();
	}

}
