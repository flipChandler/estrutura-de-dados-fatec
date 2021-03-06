#include <stdio.h>
#include <stdlib.h>

int main() {
	
	int numero; // está alocando 4 bytes na região de memória estática | em tempo de compilação
	int * ponteiro_int; // está alocando em qualquer região da memória
	float * ponteiro_float;
	char * ponteiro_char;
	
	printf ("valor inicial de ponteiro_int: %p\n", ponteiro_int);
	//ponteiro_int = malloc(4); não é recomendado
	
	// está alocando 4 bytes de memoria em ponteiro_int | compilador é responsável pela qtde de bytes
	// está alocando um espaço na região de memória dinâmica para armazenar um inteiro, em tempo de execução*** 
	// devolvendo o endereço à variavel ponteiro_int
	ponteiro_int = malloc(sizeof(int)); 
	
	printf ("valor atual de ponteiro_int: %p\n", ponteiro_int);
	
	// vetor de 100 floats
	ponteiro_float = (float *) malloc(100*sizeof(float)); // sempre fazer o casting (float *) para evitar erros, pq o malloc retorna um void * (genérico) 
	
	// (string) de 1000 caracteres
	ponteiro_char = (char *) malloc(1000*sizeof(char)); 
	
	return 0;
}


// ***  (compilador não sabe se esse espaço será utilizado ou não)
