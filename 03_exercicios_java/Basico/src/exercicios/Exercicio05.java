package exercicios;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * Ler um número inteiro e exibir a sua tabuada completa do 0 ao 10.
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = scanner.nextInt();
		
		System.out.println("-----TABUADA DO " + num + "-------");
		for (int i = 0; i < 11; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
		scanner.close();
	}

}
