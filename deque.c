#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* Funcionalidades a serem implementadas na estrutura FILA: 
 Inserção, remoção, exibição dos elementos e suas respectivas posições na fila, verificação se a fila está vazia, verificação se a fila está cheia, 
 localização de um elemento e a posição do elemento caso esteja na FILA.

 Funcionalidades a serem implementadas na estrutura PILHA:
 Inserção, remoção, Topo (mostra o elemento que está no topo da pilha mas não o remove) , verificação se a pilha está vazia, verificação se a pilha está cheia. 
 
 Funcionalidades a serem implementadas na estrutura DEQUE:
 Inserção pelo começo ou pelo fim, remoção pelo começo ou pelo fim, exibição dos elementos e suas respectivas posições no deque, verificação se o deque está vazia, verificação se o deque está cheio, 
 localização de um elemento e a posição do elemento caso esteja no DEQUE.*/

// declarações de fila f, pilha p e deque d
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

typedef struct {
	int v[50];
	int fim, comeco;
} declara_deque;

declara_deque d;

// funções da estrutura fila
int fila_inserir (){
	int n;
	
	if (f.fim == 51)
		printf("\na fila esta cheia\n\n");
	else {
		printf("\ndigite o numero a ser inserido na fila: ");
		scanf("%i", &n);
			
		f.v[f.fim] = n;
		f.fim++;
		
		printf("\n");}
}

int fila_remover(){
	int i;
	if (f.fim != f.comeco){		
		f.fim--;
		for (i = f.comeco; i < f.fim; i++){
			f.v[i] = f.v[i+1];}
			printf("\nelemento removido\n\n");}
	else
		printf("\nnao ha elementos na fila\n\n");  
	}


int fila_exibir(){
	int i;
	printf("\n\n");
	
	if (f.comeco == f.fim)
		printf("nao ha nenhum elemento na fila\n\n");
	else{
		for (i = f.comeco; i < f.fim; i++){
			printf("elemento %i (posiçao %i da fila), ", f.v[i], i);	}
		printf("\n\n"); 	}
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
		printf("\no elemento procurado esta na posiçao %i da fila\n\n", x);
	else
		printf("\no elemento procurado nao esta presente na fila\n\n");
}

// funções da estrutura pilha
int pilha_inserir(){
	int n;
	
	if (p.topo == 51)
		printf("\na pilha esta cheia\n\n");
	else {
		printf("\ndigite o numero a ser inserido na pilha: ");
		scanf("%i", &n);
			
		p.v[p.topo] = n;
		p.topo++;
		
		printf("\n");}
}

int pilha_remover(){
	if (p.topo == 0){
		printf("\na pilha esta vazia\n\n");
	}
	else{
		p.v[p.topo - 1] = 0;
		p.topo--;
		printf("\nelemento removido\n\n");	
	}
}

// funções da estrutura deque
int deque_inserir() {
	
	if (d.fim == 51)
		printf("\no deque esta cheio\n\n");
	else {
		char r;
		int n, i;
		if (d.comeco != d.fim){
			printf("\no elemento sera inserido pelo começo(c) ou pelo fim(f)? ");
			scanf(" %c", &r);
			printf("\n\ndigite o numero a ser inserido no deque: ");
			scanf(" %i", &n);
			if (r == 'c'){
				for (i = d.fim; i > d.fim; i--)
					d.v[i] = d.v[i-1];
				d.v[d.comeco] = n;
				d.fim++;}
			else if (r == 'f'){
				d.v[d.fim] = n;
				d.fim++;}
			else
				printf("\nopção invalida\n\n");	}
		else {
			printf("\n\ndigite o numero a ser inserido no deque: ");
			scanf("%i", &n);
			d.v[d.comeco] = n;
			d.fim++;}
			
		}
	}
	
int deque_remover(){
		char r;
		int i;
		if (d.comeco == d.fim){
			printf("\no elemento sera removido pelo começo(c) ou pelo fim(f)? ");
		scanf("%c", &r);
		if (r == 'c'){
			for (i = d.comeco; i < d.fim; i++)
				d.v[i] = d.v[i+1];
			d.fim--;
			d.v[d.fim] = 0;}
		else if (r == 'f'){
			d.fim--;
			d.v[d.fim] = 0;}
		else
			printf("\nopção invalida\n\n");	}
		else
			printf("\no deque esta vazio\n\n");
	}
	
int deque_exibir() {
	int i;
	printf("\n\n");
	
	if (d.comeco == d.fim)
		printf("nao ha nenhum elemento no deque\n\n");
	else{
		for (i = d.comeco; i < d.fim; i++){
		printf("elemento %i (posiçao %i do deque), ", d.v[i], i);
	}
	printf("\n\n");
	}
}


// código principal da estrutura fila
int fila (){
	printf("\n\ncomandos:\n\ninserçao(1)\nremoçao(2)\nexibiçao dos elementos(3)\nverificar se esta vazio(4) ou cheio(5)\nlocalizar elementos(6)\nfechar estrutura(s)\n\n");	
	
	char a;		
	
	do {
	printf("insira a açao que deseja realizar: ");
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
        	printf("\na fila esta vazia\n\n");
    	else 
        	printf("\na fila nao esta vazia\n\n");
		break;
		case '5':
		if (f.fim == 51)
			printf("\na fila esta cheia\n\n");
		else
			printf("\na fila nao esta cheia\n\n");
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

// código principal da estrutura pilha
int pilha(){
	printf("\n\ncomandos:\n\ninserçao(1)\nremoçao(2)\nexibir topo(3)\nverificar se esta vazia(4) ou cheia(5)\nfechar estrutura(s)\n\n");	
	
	char a;		
	
	do {
	printf("insira a açao que deseja realizar: ");
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
			printf("\nnao ha nenhum elemento na pilha\n\n");
		else
			printf("\no elemento %i esta no topo da pilha\n\n", p.v[p.topo-1]);
		break;
		case '4':
		if (p.topo == 0)
			printf("\na pilha esta vazia\n\n");
		else
			printf("\na pilha nao esta vazia\n\n");
		break;
		case '5':
		if (p.topo == 51)
			printf("\na pilha esta cheia\n\n");
		else
			printf("\na pilha nao esta cheia\n\n");
		break;
		case 's':
		printf("\nestrutura fechada\n\n");
		break;
		default:
		printf("\ncomando invalido\n\n");}}
	while (a != 's');
} 

// código principal da estrutura deque
deque(){
	printf("\n\ncomandos:\n\ninserçao(1)\nremoçao(2)\nexibiçao dos elementos(3)\nverificar se esta vazia(4) ou cheia(5)\nlocalizar elementos(6)\nfechar estrutura(s)\n\n");	
	
	char a;		
	
	do {
	printf("insira a açao que deseja realizar: ");
	scanf(" %c", &a);
	switch (a){
		case '1':
		deque_inserir();
		break;
		case '2':
		deque_remover();
		break;
		case '3':
		deque_exibir();
		break;
		case '4':
		if (f.fim == f.comeco) 
        	printf("\na fila esta vazia\n\n");
    	else 
        	printf("\na fila nao esta vazia\n\n");
		break;
		case '5':
		if (f.fim == 51)
			printf("\na fila esta cheia\n\n");
		else
			printf("\na fila nao esta cheia\n\n");
		break;
		case '6':
		fila_localizar();
		break;
		case 's':
		printf("\nestrutura fechada\n\n");
		break;
		default:
		printf("\ncomando invalido\n\n");}}
	while (a != 's');
}

// função main
void main() {
	setlocale(LC_ALL, "Portuguese");
	
	printf("estruturas:\n\nfila(f)\npilha(p)\ndeque(d)\nencerrar(s)\n\n");	
	char r;
	
	f.comeco = 0;
	f.fim = f.comeco;
	p.topo = 0;
	d.fim = d.comeco;
	d.comeco = 0;		
	
	do {
		system('cls');
	printf("insira a estrutura que deseja explorar: ");
	scanf(" %c", &r);
	switch (r){
		case 'f':
		fila();
		break;
		case 'p':
		pilha();
		break;
		case 'd':
		deque();
		break;
		case 's':
		printf("\nprograma encerrado");
		break;
		default:
		printf("\ncomando invalido\n\n");}}
	while (r != 's');
}
