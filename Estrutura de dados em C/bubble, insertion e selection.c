#include <stdio.h>
#include <stdlib.h>

int main()
{
    char buf[100], aux[6];
    int i, j, tam, x = 0;
    printf("insira a sequencia de numeros separados por virgula e termine com ponto (exemplo: 1, 2, 50, 0, 32.): ");
    gets(buf);
    for (i = 0, j = 0; buf[i] != '.'; i++){
        if (buf[i] == ','){
            j++;
        }
    }
    tam = j + 1;
    int vet[tam];
    
    for (i = 0; buf[i] != '.'; i++){
        if (buf[i] != ',' && buf[i] != ' '){
            j = 0;
            do {
                aux[j] = buf[i];
                i++;
                j++;
            } while (buf[i+1] != ',' || buf[i+1] != ',');
            vet[x] = atoi(aux);
            x++;
            for (j = 0; j < 6; j++)
                aux[j] = '.';
        }
        
    }
    
    for (i = 0; i < tam; i++){
        printf("%i/ ", vet[i]);
    }
}
