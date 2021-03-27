package intro;

import java.util.Random;
import java.util.Scanner;

public class EstudoOrdenacao {
	
	public static void exibeVetor(String msg, int ...vetor) {
		System.out.println("\n" + msg);
		for (int v : vetor) {
			System.out.print(v + " ");
		}
		System.out.println();
	}

	private static void preencherVetor(int[] v) {
		Random random = new Random(10);
		for (int i = 0; i < v.length; i++) {
			//v[i] = (int) (Math.random() * 11); 		// gera um nº de 0 e 10
			//v[i] = random.nextInt(10);   				// gera um nº de 0 e 9
			//v[i] = random.nextInt(v.length * 10);     // gera nº de aleatorios length * 10
			v[i] = random.nextInt(11); 			    	// gera um nº de 0 e 10
		}		
		
	}
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		char continua;
		do {
			System.out.println("digite o tamanho do vetor: ");
			int n = scanner.nextInt();
			int v[] = new int[n];
			
			exibeVetor("vetor zerado" , v);
			
			preencherVetor(v);
			
			exibeVetor("vetor preenchido" , v);
			
			System.out.println("deseja continuar?");
			continua = scanner.next().toLowerCase().charAt(0);
		} while (continua == 's');
		
		System.out.println("Fim da aplicação");
		scanner.close();
	}

}
