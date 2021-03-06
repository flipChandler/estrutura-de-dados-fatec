#include <stdio.h>
#include <stdlib.h>

int main() {
	int i, capacidade;
	int * v;
	printf("digite o tamanho do vetor: ");
	scanf("%d", &capacidade); // 1000000
	
	v = (int *) malloc (capacidade * sizeof(int));
	
	printf ("onde comeca o vetor: %p\n", v); // o conteudo de um ponteiro é a sua posição inicial (0)
	
	for (i = 0; i < 10; i++) {
		printf ("%p\n", v+i); // aritmetica de ponteiros (não tem em Java)
	}
	
	return 0;
}

/*
digite o tamanho do vetor: 10
onde comeca o vetor: 0000000000B07760 (posição inicial)
0000000000B07760
0000000000B07764
0000000000B07768
0000000000B0776C (12 em hexa)
0000000000B07770
0000000000B07774
0000000000B07778
0000000000B0777C
0000000000B07780
0000000000B07784



*/
