#include<stdio.h>
#include<stdlib.h>
#include "create_node.h"

int nth_node(struct node *start,int pos)
{
     struct node *ptr=start;
    int k=1;
    if(start==NULL)
     {  
         printf("memory error\n");
         return;
     }
  	while(ptr!=NULL && k>=1)
     {   
           

          if(k==pos)
        {
           return ptr->data;
   
         }
      k++;
      ptr=ptr->next;
  }



  
}

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
