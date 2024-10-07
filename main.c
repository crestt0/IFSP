#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* Funcionalidades a serem implementadas na estrutura FILA: 
 Inser��o, remo��o, exibi��o dos elementos e suas respectivas posi��es na fila, verifica��o se a fila est� vazia, verifica��o se a fila est� cheia, 
 localiza��o de um elemento e a posi��o do elemento caso esteja na FILA.

 Funcionalidades a serem implementadas na estrutura PILHA:
 Inser��o, remo��o, Topo (mostra o elemento que est� no topo da pilha mas n�o o remove) , verifica��o se a pilha est� vazia, verifica��o se a pilha est� cheia. */

// declara��es de fila f e pilha p
typedef struct {
	int v[50];
	int fim, comeco;
} declara_fila;

declara_fila f;

typedef struct {
	int v[50];
	int topo;
} declara_pilha;

declara_pilha p;

// fun��es da estrutura fila
int fila_inserir (){
	int n;
	
	printf("\n\ndigite o numero a ser inserido na fila: ");
	scanf("%i", &n);
	
	f.v[f.fim] = n;
	f.fim++;
}

int fila_remover(){
	int i;
	if (f.fim != f.comeco){		
		f.fim--;
		for (i = f.comeco; i < f.fim; i++){
			f.v[i] = f.v[i+1];}
			printf("\nelemento removido\n\n");}
	else
		printf("\nn�o h� elementos na fila\n\n"); 
	}


int fila_exibir(){
	int i;
	printf("\n\n");
	
	if (f.comeco == f.fim)
		printf("n�o h� nenhum elemento na fila\n\n");
	else{
		for (i = f.comeco; i < f.fim; i++){
		printf("elemento %i (posi��o %i da fila), ", f.v[i], i);
	}
	printf("\n\n");
	}
}

int fila_localizar(){
	int n, i, x;
	x = -1;
	
	printf("\nentre com o numero que se deseja localizar: ");
	scanf("%i", &n);
	
	for (i = f.comeco; i < f.fim; i++){
		if (f.v[i] == n)
			x = i;
	}
	
	if (x != -1)
		printf("\no elemento procurado esta na posi��o %i da fila\n\n", x);
	else
		printf("\no elemento procurado n�o esta presente na fila\n\n");
}

// fun��es da estrutura pilha
int pilha_inserir(){
	int n;
	
	printf("\n\ndigite o numero a ser inserido na pilha: ");
	scanf("%i", &n);
	
	p.v[p.topo] = n;
	p.topo++;
}

int pilha_remover(){
	p.v[p.topo - 1] = 0;
	p.topo--;
	printf("\nelemento removido\n\n");
}

// c�digo principal da estrutura fila
int fila (){
	printf("\n\ncomandos:\n\ninser��o(1)\nremo��o(2)\nexibi��o dos elementos(3)\nverificar se esta vazia(4) ou cheia(5)\nlocalizar elementos(6)\nfechar estrutura(s)\n\n");	
	
	char a;		
	
	do {
	printf("insira a a��o que deseja realizar: ");
	scanf(" %c", &a);
	switch (a){
		case '1':
		fila_inserir();
		break;
		case '2':
		fila_remover();
		break;
		case '3':
		fila_exibir();
		break;
		case '4':
		if (f.fim == f.comeco) 
        	printf("\na fila est� vazia\n\n");
    	else 
        	printf("\na fila n�o est� vazia\n\n");
		break;
		case '5':
		if (f.fim == 51)
			printf("\na fila esta cheia\n\n");
		else
			printf("\na fila n�o esta cheia\n\n");
		break;
		case '6':
		fila_localizar();
		break;
		case 's':
		printf("\nestrutura fechada\n\n");
		break;
		default:
		printf("\ncomando invalido\n\n");}}
	while (a != 's');}

// c�digo principal da estrutura pilha
int pilha(){
	printf("\n\ncomandos:\n\ninser��o(1)\nremo��o(2)\nexibir topo(3)\nverificar se esta vazia(4) ou cheia(5)\nfechar estrutura(s)\n\n");	
	
	char a;		
	
	do {
	printf("insira a a��o que deseja realizar: ");
	scanf(" %c", &a);
	switch (a){
		case '1':
		pilha_inserir();
		break;
		case '2':
		pilha_remover();
		break;
		case '3':
		if (p.topo == 0)
			printf("\nn�o h� nenhum elemento na pilha\n\n");
		else
			printf("\no elemento %i esta no topo da pilha\n\n", p.v[p.topo-1]);
		break;
		case '4':
		if (p.topo == 0)
			printf("\na pilha esta vazia\n\n");
		else
			printf("\na pilha n�o esta vazia\n\n");
		break;
		case '5':
		if (p.topo == 51)
			printf("\na pilha esta cheia\n\n");
		else
			printf("\na pilha n�o esta cheia\n\n");
		break;
		case 's':
		printf("\nestrutura fechada\n\n");
		break;
		default:
		printf("\ncomando invalido\n\n");}}
	while (a != 's');
} 

// fun��o main
void main() {
	setlocale(LC_ALL, "Portuguese");
	
	printf("estruturas:\n\nfila(f)\npilha(p)\nencerrar(s)\n\n");	
	char r;
	
	f.comeco = 0;
	f.fim = f.comeco;
	p.topo = 0;		
	
	do {
	printf("insira a estrutura que deseja explorar: ");
	scanf(" %c", &r);
	switch (r){
		case 'f':
		fila();
		break;
		case 'p':
		pilha();
		break;
		case 's':
		printf("\nprograma encerrado");
		break;
		default:
		printf("\ncomando invalido\n\n");}}
	while (r != 's');
}
