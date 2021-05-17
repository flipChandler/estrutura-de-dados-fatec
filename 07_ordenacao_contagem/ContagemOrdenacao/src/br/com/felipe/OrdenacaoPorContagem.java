package br.com.felipe;

public class OrdenacaoPorContagem {

	
	// o tamanho do vetor depende do intervalo de numeros a serem ordenados
	// ex.: 0-100, tem que ter um vetor de 100 posições
	// 1ª varredura faz a contagem de quantos elementos tem
	// CountingSort
	
	public static void main(String[] args) {
		int n = 10;			
		int v[] = {0, 6, 9, 2, 8, 7, 4, 3, 7, 9}; 
		int cont[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			cont[i] = 0;
		}
		
		for (int i = 0; i < n; i++) {
			cont[v[i]]++;
		}
		
		for (int i = 0, j = 0; i < n; i++) {
			int k = 0;
			while (k < cont[i]) {
				v[j] = i;
				j++;
				k++;
			}
		}
		
		for (int i : v) {
			System.out.print(i + " ");
		}		
	}
	
}
