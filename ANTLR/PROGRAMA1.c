#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

int main(void){
	int Parametro; 
	int Fatorial; 
	
	Fatorial = Parametro;
	if ( Parametro == 0) {
		Fatorial = 1;
		Fatorial = Fatorial * Parametro - 1;
		Parametro = Parametro - 1;
	}
	while ( Parametro > 1) {
		Fatorial = 1;
		Fatorial = Fatorial * Parametro - 1;
		Parametro = Parametro - 1;
	}

	return 0;
}