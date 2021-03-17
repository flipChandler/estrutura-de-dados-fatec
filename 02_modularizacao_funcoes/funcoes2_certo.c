#include <stdio.h>
#include <stdlib.h>

int * devolve_vetor(int);

int main() {
	int * vetor;
	vetor = devolve_vetor(10);
	
	if (vetor != NULL) {// p/ evitar null pointer	
		// processamento da lista de valores em vetor   		
		free(vetor); // libera a região de memória que o ponteiro de vetor aponta
	}
	
	vetor = devolve_vetor(100);
	//...
	
	free(vetor);
	
	vetor = NULL; // zerou a informação que estava armazenada em vetor (devolve_vetor()) 
	
	// boas práticas diz: sempre liberar a memória e zerar o ponteiro
	return 0;
}

int * devolve_vetor(int n) {
	// malloc, a região de memória não é descartada quando a funcao devolve_vetor terminar
	// só é descartada quando o dev indicar que pode
	int * v = (int *) malloc (n * sizeof(int));	
	return v;
}
