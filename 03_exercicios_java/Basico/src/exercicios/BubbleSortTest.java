package exercicios;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class BubbleSortTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] v = new int[5];
		
		for (int i = 0; i < v.length; i++) {
			v[i] = random.nextInt(11); // 0 até 10
		}
		
		System.out.print("Lista desordenada: ");
		for (int i : v) {
			System.out.print(i + " ");
		}
		
		// bubblesort
		for (int i = 1; i < v.length; i++) {
			for (int j = 0; j < v.length - i; j++) {
				if (v[j] > v[j + 1]) {
					int temp = v[j];
					v[j] = v[j + 1];
					v[j + 1] = temp;
				}
			}
		}
		
		
		System.out.print("\n\nLista ordenada: ");
		for (int i : v) {
			System.out.print(i + " ");
		}
		
		
		scanner.close();
		
	}

}
