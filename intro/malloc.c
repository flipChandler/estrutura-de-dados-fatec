#include <stdio.h>
#include <stdlib.h>

int main() {
	
	int numero; // est� alocando 4 bytes na regi�o de mem�ria est�tica | em tempo de compila��o
	int * ponteiro_int; // est� alocando em qualquer regi�o da mem�ria
	float * ponteiro_float;
	char * ponteiro_char;
	
	printf ("valor inicial de ponteiro_int: %p\n", ponteiro_int);
	//ponteiro_int = malloc(4); n�o � recomendado
	
	// est� alocando 4 bytes de memoria em ponteiro_int | compilador � respons�vel pela qtde de bytes
	// est� alocando um espa�o na regi�o de mem�ria din�mica para armazenar um inteiro, em tempo de execu��o*** 
	// devolvendo o endere�o � variavel ponteiro_int
	ponteiro_int = malloc(sizeof(int)); 
	
	printf ("valor atual de ponteiro_int: %p\n", ponteiro_int);
	
	// vetor de 100 floats
	ponteiro_float = (float *) malloc(100*sizeof(float)); // sempre fazer o casting (float *) para evitar erros, pq o malloc retorna um void * (gen�rico) 
	
	// (string) de 1000 caracteres
	ponteiro_char = (char *) malloc(1000*sizeof(char)); 
	
	return 0;
}


// ***  (compilador n�o sabe se esse espa�o ser� utilizado ou n�o)
