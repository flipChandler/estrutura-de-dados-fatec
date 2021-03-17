#include <stdio.h>

void le_vetor(int vetor[], int tamanho) {
	int i;
	for (i = 0; i < tamanho; i++) {
		scanf ("%d", &vetor[i]);
	}
}

void mostra_vetor(int vetor[], int tamanho) {
	int i;
	printf ("vetor = %p\ntamanho = %d\n", vetor, tamanho);
	printf ("endereco da variavel vetor = %p\n", &vetor); // & = operador referência | onde está o vetor
	printf ("endereco da variavel tamanho = %p\n", &tamanho);
	for (i = 0; i < tamanho; i++) {
	//	printf ("%d\n", vetor[i]);
	}	
}

int main() {
	int v1[5], v2[500];
	int opcao;
	
	printf ("endereco da varivael opcao = %p\n", &opcao);
	printf ("digite 1 para ler vetor ou 2 para exibir vetor: ");
	scanf ("%d", &opcao);
	
	switch(opcao) {
		case 1:
			le_vetor(v1, 5);
			le_vetor(v2, 500);
			break;
		case 2:
			printf ("\nendereco do vetor v1 = %p\n", v1); // %p = pointer
			printf ("endereco da variavel v1 = %p\n", &v1); // & = operador referência | onde está v1
			mostra_vetor(v1, 5);
			printf ("\nendereco do vetor v2 = %p\n", v2);
			printf ("endereco da variavel v2 = %p\n", &v2); // & = operador referência | onde está v2
			mostra_vetor(v2, 500);
			break;
	}	
	
	return 0;
}
