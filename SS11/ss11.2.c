#include <stdio.h>
void main()
{
	char alpha[0];
	int i, j;
	for(i=65, j=0; i<91; i++, j++)
	{
		alpha[j] =i;
		printf("\nThe character now assigned is %c", alpha [j]);
	}
	getchar();
}
