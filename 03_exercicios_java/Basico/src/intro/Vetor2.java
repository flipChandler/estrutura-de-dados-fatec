package intro;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = scanner.nextInt();
		
		int vetor[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("digite o valor da posicao " + i +": ");
			vetor[i] = scanner.nextInt();
		}		
		
		System.out.print("\nValores digitados: ");
		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] +" ");
		}		
				
		scanner.close();
	}

}
