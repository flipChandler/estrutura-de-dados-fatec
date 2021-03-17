import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Ler uma temperatura em Graus Celsius, converter para Fahrenheit e exibir o resultado.
		 */
		Scanner scanner = new Scanner(System.in);
		double celsius, fahrenheit;
		System.out.println("Digite a temperatura em graus Celsius:");
		celsius = scanner.nextDouble();
		
		fahrenheit = celsius * 1.8 + 32;
		System.out.println(celsius + " graus Celsius = " + fahrenheit + " graus Fahrenheit");
		
		scanner.close();

	}

}
