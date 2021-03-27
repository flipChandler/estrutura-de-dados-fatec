package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Ler as coordenadas (x, y) de dois pontos P1 e P2, calcular a distância entre eles e exibir o resultado. 
		 * A distância é dada por  . Pesquise na classe Math do Java para o uso da raiz quadrada. 
		 */
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Digite a coordenadas x e y de P1: ");
		int xP1 = scanner.nextInt();
		int yP1 = scanner.nextInt();
		
		System.out.println("Digite a coordenadas x e y de P2: ");
		int xP2 = scanner.nextInt();
		int yP2 = scanner.nextInt();
		
		double distancia = Math.sqrt((xP2 - xP1) * (xP2 - xP1) + (yP2 - yP1) * (yP2 - yP1));
		
		System.out.println("Distancia entre P1 e P2 é " + df.format(distancia));
		
		scanner.close();
	}

}
