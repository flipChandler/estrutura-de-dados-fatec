import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Ler o valor de um raio r, calcular o comprimento da circunferência, a área do círculo e o volume da esfera
		 * correspondentes. Pesquise a classe Math do Java para o uso do PI.
		 */
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		double r, circunferencia, areaCirculo, volumeEsfera;
		System.out.println("Digite o valor do raio: ");
		r = scanner.nextDouble();
		
		circunferencia = 2 * Math.PI * r;
		areaCirculo = Math.PI * r * r;
		volumeEsfera = (4 * Math.PI * r * r * r ) / 3;
		
		System.out.println("Tamanho do raio = " + r);
		System.out.println("Comprimento da circunferência = " + df.format(circunferencia));
		System.out.println("Área do círculo = " + df.format(areaCirculo));
		System.out.println("Volume da esfera = " + df.format(volumeEsfera));
		
		scanner.close();
	}

}
