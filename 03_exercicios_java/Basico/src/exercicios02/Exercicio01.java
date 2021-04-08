package exercicios02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite quantas notas deseja digitar: ");
		int n = scanner.nextInt(); 
		
		double [] notas = new double[n];
		
		lerNotas(notas);
		
		calcularEMostrarMedia(notas);
		
		scanner.close();
	}
	
	public static void lerNotas(double[] vetor) {
		Scanner scanner = new Scanner(System.in); 
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("digite a " + (i + 1) + " º nota: ");
			vetor[i] = scanner.nextDouble();
		}
		
		scanner.close();
	}
	
	public static void calcularEMostrarMedia(double[] vetor) {
		double media = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			media += vetor[i];
		}
		
		media = media / vetor.length;
		
		System.out.println("media = " + media);
	}

}
