#include <stdio.h>
#include <stdlib.h>

void bubble(int *vet, int tam){
    int i, j, aux;
    
    for (i = 0; i < tam; i++){
        for(j = 0; j < tam - i; j++){
            if (vet[j] > vet[j+1]){
                aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
            }
        }
    }
}

void selection(int *vet, int tam){
    int i, j, aux, indexMenor;
    
    for (i = 0; i < tam; i++){
        indexMenor = i;
        for (j = i; j < tam; j++){
            if(vet[j] < vet[indexMenor]){
                indexMenor = j;
            }
        }
        aux = vet[indexMenor];
        vet[indexMenor] = vet[i];
        vet[i] = aux;
    }
}

void insertion(int *vet, int tam){
    int i, j, aux;
    
    for (i = 0; i < tam; i++){
        for (j = i; ){
            
        }
    }
}selectio

int main()
{
    int buffer[1000], tam = 0, i;
    
    printf("entre com o valor dos numeros separado por espaço e termine com 'f'(exemplo: 1 3 50 2 4444 0 f): ");
    
    int result;
    while ((result = scanf("%i", &buffer[tam])) == 1) {
        tam++;
    }

    int vetor[tam];

    for (i = 0; i < tam; i++) {
        vetor[i] = buffer[i];
    }
    
    insertion(vetor, tam);
    
    for (i = 0; i < tam; i++){
        printf("%i /", vetor[i]);
    }
    
    return 0;
}
