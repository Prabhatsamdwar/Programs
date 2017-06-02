#include<stdio.h>
#include<stdlib.h>
#include "create_node.h"


	void main()
	{
	struct node *start1=NULL;

	create_node(&start1,11);
	create_node(&start1,21);
	create_node(&start1,5);
	create_node(&start1,8);
	create_node(&start1,14);

        int n=nth_node(start1,5);

         printlist(start1);
	 printf("\n\n");

         printf("nth node is : %d \n",n);
	}
