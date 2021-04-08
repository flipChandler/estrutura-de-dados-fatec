import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class InsertionSortTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		char continua;
		
		do {
			
			System.out.println("digite o tamanho do vetor: ");
			int n = scanner.nextInt();
			int v[] = new int[n];
			
			preencherVetor(v);
			
			exibirVetor("vetor preenchido" , v);
			
			long inicio = new Date().getTime();
			insertionSort(v);
			long fim = new Date().getTime();
			
			exibirVetor("vetor ordenado" , v);
			System.out.println("Tempo de ordenação para o tamanho " + n + ": " + (fim - inicio) + "ms");
			
			System.out.println("\ndeseja continuar?");
			scanner.nextLine();
			continua = scanner.nextLine().toLowerCase().charAt(0);
		} while (continua == 's');
		
		System.out.println("Fim da aplicação");
		scanner.close();

	}
	
	public static void exibirVetor(String msg, int ...vetor) {
		System.out.println("\n" + msg);
		for (int v : vetor) {
			System.out.print(v + " ");
		}
		System.out.println();
	}
	
	
	public static void preencherVetor(int[] v) {
		Random random = new Random(10);
		for (int i = 0; i < v.length; i++) {
			v[i] = random.nextInt(v.length * 10);      
		}	
		
	}
	
	public static void insertionSort (int v[]) {
		for (int i = 1; i < v.length; ++i) {
			int temp = v[i];
			int j;
			for (j = i - 1; j >= 0 && v[j] > temp; --j) {
				v[j + 1] = v[j];
			}				
			v[j + 1] = temp;
		}
	}
	
	

}
