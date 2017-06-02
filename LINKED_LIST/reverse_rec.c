#include<stdio.h>
#include<stdlib.h>
#include "create_node.h"


struct node *reverse_rec(struct node *head)
{
   struct node *cur=head;
   if(cur==NULL)
      return;
  if(cur->next==NULL)
  {
    head=cur;
    return;
  }

struct node *rev=reverse_rec(cur->next);

cur->next->next=cur;
cur->next=NULL;

return rev;
}

int main()
{
  struct node *start=NULL;
  create_node(&start,5);
  create_node(&start,8);
  create_node(&start,4);
  create_node(&start,9);
  create_node(&start,7);

  printf("list before reverse \n");
   printlist(start);
   struct node *temp=reverse_rec(start);
   printf("\n List after reverse \n");
   printlist(temp);

}
