import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Ler um n�mero inteiro e dizer se ele � par ou �mpar.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int num = scanner.nextInt();
		
		String parOuImpar = num % 2 == 0 ? "par" : "impar";
		
		System.out.println(num + " � " + parOuImpar);
		
		scanner.close();
	}

}
