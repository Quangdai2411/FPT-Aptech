#include <stdio.h>
#include<string.h>
void main()
{
	int i, n = 0;
	int item;
	char x[10][12];
	char temp[12];
	printf("\n\nEnter each string on a separate line");
	printf("\n\nType 'END' when over");
	/* read in the list of strings */
	do
	{
		printf("\nString %d :", n+1);
		scanf("%s", x[n]);
	}	while(strcmp(x[n++], "END"));
	/*reorder the list of strings */
	n = n - 1;
	for(item = 0; item<n-1; ++item)
	{
		/* find lowest of remaining strings */
		for(i=item+1; i<n; ++i)
		{
			if(strcmp(x[item], x[i]) > 0)
			/*interchange two strings */
			strcpy(temp, x[item]);
			strcpy(x[item], x[i]);
			strcpy(x[i], temp);
		}
	}
	/* Display the arranged list of strings */
	printf("\nrecorded list of strings :");
	for(i = 0; i<n; ++i)
	{
		printf("\nString %d is %s", i+1, x[1]);
	}
}
