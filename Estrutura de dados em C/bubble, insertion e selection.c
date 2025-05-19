#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void bubble(int *vet, int tam){
    int i, j, aux;
    
    for (i = 0; i < tam; i++){
        for(j = 0; j < tam - i - 1; j++){
            if (vet[j] > vet[j + 1]){
                aux = vet[j];
                vet[j] = vet[j + 1];
                vet[j + 1] = aux;
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
    
    for (i = 1; i < tam; i++){
        for (j = i; vet[j - 1] > vet[j] && j != 0; j--){
            aux = vet[j - 1];
            vet[j - 1] = vet[j];
            vet[j] = aux;
        }
    }
}

int main()
{
    int buffer[1000], tam = 0, i, *vetor;
    char resposta;
    double tempoGasto;
    
    while(1){
        printf("\nfuncionalidades: \n\ninserir elementos na lista(1)\nvisualizar a lista atual(2)\napagar a lista atual(3)\nordenar por bubble sort(4)\nordenar por selection sort(5)\nordenar por insertion sort(6)\n\nresposta: ");
        scanf(" %c", &resposta);
        switch(resposta){
        case '1':
            printf("\nentre com o valor dos numeros separado por espaço e termine com 'f'(exemplo: 1 3 50 2 4444 0 f): ");
            
            int result;
            while ((result = scanf("%i", &buffer[tam])) == 1) {
                tam++;
            }
            
            vetor = malloc(tam * sizeof(int));
            
            for (i = 0; i < tam; i++) {
                vetor[i] = buffer[i];
            }
            printf("\n\n");
            break;
        case '2': 
            if(tam == 0){
                printf("\nnenhum número foi inserido ainda\n");
            }
            else{
                printf("\nvetor atual: ");
                for (i = 0; i < tam; i++){
                    printf("%i, ", vetor[i]);
                }
                printf("\n\n");
            }
            break;
        case '3':
            vetor = realloc(vetor, sizeof(int));
            tam = 0;
            printf("\nlista apagada com sucesso\n");
            break;
        case '4':
            clock_t begin1 = clock();
            
            bubble(vetor, tam);
            
            clock_t end1 = clock();
            tempoGasto = 1000*((double)(end1 - begin1) / CLOCKS_PER_SEC);
            printf("\nvetor ordenado pelo bubble sort, tempo gasto: %f * 10^-3 segundos\n", tempoGasto);
            break;
        case '5':
            clock_t begin2 = clock();
            
            selection(vetor, tam);
            
            clock_t end2 = clock();
            tempoGasto = 1000*((double)(end2 - begin2) / CLOCKS_PER_SEC);
            printf("\nvetor ordenado pelo selection sort, tempo gasto: %f * 10^-3 segundos\n", tempoGasto);
            break;
        case '6':
            clock_t begin3 = clock();
            
            insertion(vetor, tam);
            
            clock_t end3 = clock();
            tempoGasto = 1000*((double)(end3 - begin3) / CLOCKS_PER_SEC);
            printf("\nvetor ordenado pelo insertion sort, tempo gasto: %f * 10^-3 segundos\n", tempoGasto);
            break;
        default:
            printf("\ncomando não identificado\n");
            break;
        }
    }

    return 0;
}
