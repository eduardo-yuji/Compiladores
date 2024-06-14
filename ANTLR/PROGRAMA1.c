#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

int main(void){
	int Parametro; 
	int Fatorial; 
	float Teste; 
	
	if ( Parametro < 5 && Parametro > 0) {
		Parametro = Parametro - 1;
	}
	while ( Parametro > 1) {
		Fatorial = 1;
		Fatorial = Fatorial * Parametro - 1;
	}
	printf("%d", Fatorial);
	printf("%f", Teste);

	return 0;
}