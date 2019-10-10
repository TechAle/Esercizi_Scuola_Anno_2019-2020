/*
	Name: Ricerca di un elemento in vettore
	Author: Alessandro Condello
	Date: 01/10/19 08:54
	Description: Si scriva una funzione in C, denominata cerca, che ricerchi la presenza di un elemento in un
				 vettore di interi. Il vettore e il valore x da cercare sono varabili globali
				 La funzione deve restituire un valore intero, ed in particolare:
				 � se il valore x � presente nel vettore, allora la funzione restituisce l�indice della posizione
				 alla quale si trova tale valore;
   				 � se il valore x � presente pi� volte, si restituisca l�indice della prima occorrenza;
				 � se il valore x non � presente nel vettore, si restituisca -1.
*/
#include <stdio.h>
#define N 5

int vet[N];
int x;

void rich(int len_);
int ricerca(int len);

void rich(int len)
{
	int i;
	for(i = 0; i < len ; i++)
	{
		printf("%d valore: ",i+1);
		scanf("%d",&vet[i]);
	}
}

int ricerca(int len)
{
	int i = 0,
		trov = 0;
	do
	{
		if ( vet[i] == x )
			trov++;
		else
			i++;
	}while(i < len && !trov);
	if(trov)
		return i;
	else
		return -1;
}

int main()
{
	rich(N);
	printf("Incognita: ");
	scanf("%d",&x);
	int ris = ricerca(N);
	if ( ris == -1)
		printf("Incognita non trovata");
	else
		printf("Incognita trovata a posizione %d",ris);
}






