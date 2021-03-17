#include <stdio.h>
#include <stdlib.h>

int * devolve_vetor(int);

int main() {
	int * vetor;
	vetor = devolve_vetor(10);
	
	if (vetor != NULL) {// p/ evitar null pointer	
		// processamento da lista de valores em vetor   		
		free(vetor); // libera a regi�o de mem�ria que o ponteiro de vetor aponta
	}
	
	vetor = devolve_vetor(100);
	//...
	
	free(vetor);
	
	vetor = NULL; // zerou a informa��o que estava armazenada em vetor (devolve_vetor()) 
	
	// boas pr�ticas diz: sempre liberar a mem�ria e zerar o ponteiro
	return 0;
}

int * devolve_vetor(int n) {
	// malloc, a regi�o de mem�ria n�o � descartada quando a funcao devolve_vetor terminar
	// s� � descartada quando o dev indicar que pode
	int * v = (int *) malloc (n * sizeof(int));	
	return v;
}
