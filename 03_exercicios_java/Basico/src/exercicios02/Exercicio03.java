package exercicios02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		eMaior(num1, num2);
		
		scanner.close();
	}
	
	public static void eMaior (int n1, int n2) {
		if (n1 > n2) {
			System.out.println("O maior é: " + n1);
		} else if (n2 > n1) {
			System.out.println("O maior é: " + n2);			
		}
	}

}
