import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class SelectionSortTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		char continua;
		
		do {
			
			System.out.println("digite o tamanho do vetor: ");
			int n = scanner.nextInt();
			int v[] = new int[n];
			
			preencherVetor(v);
			
			//exibirVetor("vetor preenchido" , v);
			
			long inicio = new Date().getTime();
			selectionSort(v);
			long fim = new Date().getTime();
			
			//exibirVetor("vetor ordenado" , v);
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
	
	public static void selectionSort (int v[]) {
	   for (int i = 0; i < v.length - 1; ++i) {
	      int min = i;
	      for (int j = i + 1; j < v.length; ++j)
	         if (v[j] < v[min]) {
	        	  min = j;
	         }
	      int x = v[i];
	      v[i] = v[min]; 
	      v[min] = x;
	   }
	}

}
