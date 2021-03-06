#include <stdio.h>
#include <stdlib.h>

int main() {
	 int * v;
	 
	 printf ("tamanho de v = %d\n", sizeof(v));// o v tem 4 bytes, porém, aponta para uma região de 4 milhões de bytes
	 
	 v = (int *) malloc (1000000*sizeof(int)); // alocar na memoria dinamica 1 milhão de int (4) -> 4 milhoes de bytes
	 
	 v[1000000] = 22;
	 
	 printf ("onde comeca o vetor: %p\n", v);	 
	 
	 printf ("v na posicao 1 milhao: %d\n", v[1000000]);
	 
	 return 0;
}
