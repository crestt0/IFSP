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
    int i, x = 17;
    int vetor[] = {4, 3, 1, 9, 6, 10, 500, 67, 344, 90, 627, 948, 256, 78, 3, 293, 5};
    QuickSort(vetor, x);
    for (i = 0; i < x; i++){
        printf("%i, ", vetor[i]);
    }

}
