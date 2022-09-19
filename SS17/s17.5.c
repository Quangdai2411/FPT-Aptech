#include<stdio.h>
#include<string.h>
void main()
{
	char str1[15] = "New York";
	char str2[15] = "washington";
	char chr = 'a', loc;
	
	loc = strchr(str1, chr);
	if(loc != NULL)
		printf("%c occurs in %s\n", chr, str1);
	else
		printf("%c dose not occurs in %s\n", chr, str1);
		
	loc = strchr(str2, chr);
	if(loc != NULL)
		printf("%c occurs in %s\n", chr, str2);
	else
		printf("%c dpse not occurs in %s\n", chr, str2);
}
