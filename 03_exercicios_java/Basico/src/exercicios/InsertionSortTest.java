package exercicios;

import java.util.Random;
import java.util.Scanner;

public class InsertionSortTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] v = new int[10];
		
		for (int i = 0; i < v.length; i++) {
			v[i] = random.nextInt(11); 
		}
		
		System.out.print("Lista desordenada: ");
		for (int i : v) {
			System.out.print(i + " ");
		}
		
		// insertion sort
		for (int i = 1; i < v.length; i++) {
			int temp = v[i];
			int j;
			
			for (j = i - 1; j >= 0 && v[j] > temp; j--) {
				v[j + 1] = v[j];
			}
			v[j + 1] = temp;
		}
		
		
		System.out.print("\n\nLista ordenada: ");
		for (int i : v) {
			System.out.print(i + " ");
		}
		
		
		scanner.close();
	}

}
