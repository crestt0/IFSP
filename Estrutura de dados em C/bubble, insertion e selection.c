#include <stdio.h>
#include <stdlib.h>

int main()
{
    int buffer[1000], tam = 0;
    
    printf("entre com o valor dos numeros separado por espaço e termine com 'f'(exemplo: 1 3 50 2 4444 0 f): ");
    
    int result;
    while ((result = scanf("%i", &buffer[tam])) == 1) {
        tam++;
    }

    int vetor[tam];

    for (i = 0; i < tam; i++) {
        vetor[i] = buffer[i];
    }
    
    for (i = 0; i < tam; i++){
        printf("%i /", vetor[i]);
    }
    
    return 0;
}
