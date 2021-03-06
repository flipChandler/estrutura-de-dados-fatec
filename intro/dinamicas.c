#include <stdio.h>
#include <stdlib.h>

int main() {
	 int * v;
	 
	 printf ("tamanho de v = %d\n", sizeof(v));// o v tem 4 bytes, por�m, aponta para uma regi�o de 4 milh�es de bytes
	 
	 v = (int *) malloc (1000000*sizeof(int)); // alocar na memoria dinamica 1 milh�o de int (4) -> 4 milhoes de bytes
	 
	 v[1000000] = 22;
	 
	 printf ("onde comeca o vetor: %p\n", v);	 
	 
	 printf ("v na posicao 1 milhao: %d\n", v[1000000]);
	 
	 return 0;
}
