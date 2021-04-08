package intro;

import java.util.Date;
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

	public static void preencherVetor(int[] v) {
		Random random = new Random(10);
		for (int i = 0; i < v.length; i++) {
			//v[i] = (int) (Math.random() * 11); 		// gera um nº de 0 e 10
			//v[i] = random.nextInt(10);   				// gera um nº de 0 e 9
			v[i] = random.nextInt(v.length * 10);       // gera nº de aleatorios length * 10
			//v[i] = random.nextInt(11); 			   	// gera um nº de 0 e 10
		}		
		
	}
	
	public static void ordenaVetorBubbleSort(int ...vetor) {
		for (int i = 1; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - i; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
				}
			}
		}
	}
	
	
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		char continua;
		do {
			
			System.out.println("digite o tamanho do vetor: ");
			int n = scanner.nextInt();
			int v[] = new int[n];
			
			preencherVetor(v);
			
			//exibeVetor("vetor preenchido" , v);
			Date inidate = new Date();
			long inicio = System.currentTimeMillis();
			ordenaVetorBubbleSort(v);
			long fim = System.currentTimeMillis();
			//exibeVetor("vetor ordenado" , v);
			System.out.println("Tempo de execução para ordenar o vetor: " + (fim - inicio) + "ms");
			
			System.out.println("\ndeseja continuar?");
			scanner.nextLine();
			continua = scanner.nextLine().toLowerCase().charAt(0);
		} while (continua == 's');
		
		System.out.println("Fim da aplicação");
		scanner.close();
	}

}

/*
 *Performance das Ordenações:
 
BubbleSort:
  -Melhor caso: O(N)
  -Pior Caso: O(N^2)
  -Não recomendado para grandes conjuntos
 
InsertionSort:
  -Melhor caso: O(N)
  -Pior Caso: O(N^2)
  -Eficiente para conjunto pequeno de dados
  -Estável: não altera a ordem de dados iguais
  -Capaz de Ordenar os dados a medida em que os recebe
 
SelectionSort:
   -Melhor Caso: O(N^2)
   -Pior Caso: O(N^2)
   -Ineficiente para grandes conjuntos de dados
   -Estável:não altera a ordem de dados iguais
 
QuickSort:
   -Melhor Caso: O(N log N)
   -Pior Caso (raro): O(N^2)
   -Estável:não altera a ordem de dados iguais
   -Desvantagem: Seria na hora de escolher o pivô. 
 */