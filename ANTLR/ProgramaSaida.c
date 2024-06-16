#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

int main(void){
	int Parametro; 
	int Fatorial; 
	Parametro = 2;
	Fatorial = 0;
	if ( Parametro < 0) {
		while ( Fatorial < 10) {
		Fatorial = Fatorial + 1;
	}
	} else {
		Fatorial = Fatorial - 1;
	}
	printf("%d\n", Parametro);
	printf("%d\n", Fatorial);

	return 0;
}