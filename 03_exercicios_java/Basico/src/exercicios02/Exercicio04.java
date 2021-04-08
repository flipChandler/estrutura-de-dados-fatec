package exercicios02;

import java.util.Scanner;

public class Exercicio04 {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		double[] notas = new double[3];
		char tipoMedia;			
		
		lerNotas(notas);
		
		do {
			System.out.print("Digite [A] para média aritmética ou [P] para ponderada: ");
			tipoMedia = scanner.next().toLowerCase().charAt(0);
			
			calcularEExibirMedia(notas, tipoMedia);
		} while (tipoMedia != 'a' && tipoMedia != 'p');
		
		scanner.close();
	}

	
	public static void lerNotas(double[] notas) {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("digite a " + (i+1) + "º nota");
			notas[i] = scanner.nextDouble();		
		}		
	}
	
	public static void calcularEExibirMedia(double[] notas, char tipoMedia) {
		
		switch(tipoMedia) {
			case 'a':
				mediaAritmetica(notas);
				break;
			case 'p':
				mediaPonderada(notas);
				break;
		}		
	}
	
	public static void mediaAritmetica(double[] notas) {
		double media = 0;		
		
		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		media = media / notas.length;
		System.out.println("\nMedia aritmética = " + media);
	}
	
	public static void mediaPonderada(double[] notas) {
		double media = 0;		
		
		media = (notas[0] * 5 + notas[1] * 3 + notas[2] * 2) / 10;
		System.out.println("\nMedia ponderada = " + media);
	}
}
