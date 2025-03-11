/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    char buf[100];
    int i, j, x;
    printf("insira a sequencia de numeros separados por virgula e termine com ponto (exemplo: 1, 2, 50, 0, 32.): ");
    gets(buf);
    for (i = 0, j = 0; buf[i] != '.'; i++){
        if (buf[i] == ','){
            j++;
        }
    }
    x = j + 1;
    int vet[x];
    
    for (i = 0, j = 0; buf[i] != '.'; i++){
        if (buf[i] == ','){
            i++;
        }
        else{
            vet[j] = atoi(buf[i]);
            j++;
        }
    }
    
    for (i = 0; i < x; i++){
        printf("%i/ ", vet[i]);
    }
}
