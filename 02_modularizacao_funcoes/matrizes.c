#include <stdio.h>
#include <stdlib.h>

int main() {
	int i; // tipo int
	int * pi; // tipo de ponteiro de int | guarda um endere�o de inteiro
	int ** ppi;// tipo de ponteiro de ponteiro de inteiro | guarda um endere�o de endere�o de inteiro
	
	pi = &i;
	ppi = &pi;
	
	return 0;
}
