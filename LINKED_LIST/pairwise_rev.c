#include<stdio.h>
#include<stdlib.h>
#include "create_node.h"

struct node *pairwise_rev(struct node *start)
{
struct node *temp=start;
struct node *q=start;
  int k;

  while(temp!=NULL && temp->next!=NULL)
{
   k=temp->data;
   temp->data=temp->next->data;
   temp->next->data=k;

   temp=temp->next->next;
}

return start;

}


void  main()
{
  struct node *start=NULL;
  create_node(&start,8);
  create_node(&start,7);
  create_node(&start,6);
  create_node(&start,5);
  create_node(&start,4);
  create_node(&start,3);
  create_node(&start,2);
  create_node(&start,1);
  printf("list before reverse \n");
  printlist(start);

 struct node *p=pairwise_rev(start);
   printf("\n List after reverse \n");
   printlist(p);

}
