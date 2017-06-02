#include<stdio.h>
#include<stdlib.h>
#include "create_node.h"

struct node * kth_alt_reverse(struct node *head,int k)
{
  int count=0;
  struct node *cur=head;
  struct node *prev=NULL;
  struct node * nxt=NULL;

     while(cur!=NULL && count<k)
     {
       nxt=cur->next;
       cur->next=prev;
       prev=cur;
       cur=nxt;
       count++;
     }

  if(head!=NULL)
  {
     head->next=cur;
  }
count=0;

while(count<k-1 && cur!=NULL)
{
cur=cur->next;
count++;
}

if(cur!=NULL)
{
  cur->next=kth_alt_reverse(cur->next,k);
}

return prev;
}

  void main()
  {
     struct node *start=NULL;
     create_node(&start,9);
     create_node(&start,8);
     create_node(&start,7);
     create_node(&start,6);
     create_node(&start,5);
      create_node(&start,4);
      create_node(&start,3);
      create_node(&start,2);
       create_node(&start,1);

    printf("before kth reverse\n");
    printlist(start);
    printf("\n");

    struct node * temp=kth_alt_reverse(start,1);
      printf( "After kth reverse\n");
    printlist(temp);

  }
