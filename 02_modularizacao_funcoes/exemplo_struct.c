#include <stdio.h>

struct Pessoa {
	int idade;
	float peso;
	char * nome; // ponteiro de char
};

int main() {
	struct Pessoa lista[40];
	
	lista[0].nome = "Paulo";
	
	return 0;
}
