package exercicios;

import java.util.Random;
import java.util.Scanner;

public class SelectionSortTest {

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
		
		// selection sort 
		for (int i = 0; i < v.length - 1; i++) {
			int min = i;
			
			for (int j = i + 1; j < v.length; j++) {
				if(v[j] < v[min]) {
					min = j;
				}
			}			
			int temp = v[i];
			v[i] = v[min];
			v[min] = temp;
		}
		
		
		System.out.print("\n\nLista ordenada: ");
		for (int i : v) {
			System.out.print(i + " ");
		}
		
		
		scanner.close();
	}

}
