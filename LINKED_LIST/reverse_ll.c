#include<stdio.h>
#include<stdlib.h>
#include "create_node.h"

 struct node *reverse_list(struct node **start)
{
  struct node *ptr, *nxt,*prev;
  ptr=(*start);
  prev=NULL;

  while(ptr!=NULL)
{
  nxt=ptr->next;
  ptr->next=prev;
  prev=ptr;
  ptr=nxt;
 }

(*start)=prev;

}


void main()
{
   struct node *start=NULL;
   create_node(&start,8);
   create_node(&start,11);
   create_node(&start,7);
   create_node(&start,9);
    create_node(&start,4);

  printlist(start);
  printf("\n");

  reverse_list(&start);

  printlist(start);

}
