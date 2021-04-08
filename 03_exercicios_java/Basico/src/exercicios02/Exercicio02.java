package exercicios02;

public class Exercicio02 {

	public static void main (String[] args) {
		int[] vetor = new int[50];

		preencherVetor(vetor);

		exibirVetor(vetor);
	}	

	public static void preencherVetor (int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = 101 + i;
		}
	}
	
	public static void exibirVetor (int[] vetor) {
		System.out.print ("Exibir vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print (vetor[i] + " ");
		}		
	}

}
