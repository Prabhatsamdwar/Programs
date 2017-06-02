#include<stdio.h>
#include<stdlib.h>
#include "create_node.h"

int middle_ele(struct node *start)
{
  struct node *slow=start;
  struct node *fast=start;

  if(start==NULL)
    return;

  while(slow!=NULL && fast!=NULL && fast->next!=NULL)
 {
      slow=slow->next;
      fast=fast->next->next;


  return slow->data;

}



void main()
{
struct node *start=NULL;

create_node(&start,5);
create_node(&start,8);
create_node(&start,1);
create_node(&start,4);
create_node(&start,11);
create_node(&start,9);
create_node(&start,12);




printlist(start);
printf("\n\n");

printf(" middle element = %d",middle_ele(start));

}
