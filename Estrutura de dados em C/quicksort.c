#include <stdio.h>
#include <stdlib.h>

int QuickSort(int *vet, int tam){
    if (tam < 2){
        return;
    }
    int x = (tam - (tam % 2))/2;
    int i, j = 0, m = 0, pivo = vet[x];
    int maior[tam];
    int menor[tam];
    for (i = 0; i < tam; i++){
        if (vet[i] < pivo){
            menor[j] = vet[i];
            j++;
        }
        else if(vet[i] > pivo){
            maior[m] = vet[i];
            m++;
        }
    }
    
    QuickSort(menor, j);
    QuickSort(maior, m);
    
    int k = 0;
    for (i = 0; i < j; i++) {
        vet[k++] = menor[i];
    }
    vet[k++] = pivo;
    for (i = 0; i < m; i++) {
        vet[k++] = maior[i];
    }
}

int main()
{
    int i, tam = 0, buffer[1000];
    printf("entre com o valor dos numeros separado por espaço e termine com 'f'(exemplo: 1 3 50 2 4444 0 f): ");
    
    int result;
    while ((result = scanf("%i", &buffer[tam])) == 1) {
        tam++;
    }

    int vetor[tam];

    for (i = 0; i < tam; i++) {
        vetor[i] = buffer[i];
    }
    QuickSort(vetor, tam);
    for (i = 0; i < x; i++){
        printf("%i, ", vetor[i]);
    }

}
