#include<stdio.h>
#include<stdlib.h>
#include "create_node.h"

void push(struct node **start,int data)
{

   struct node *newnode=(struct node *)malloc(sizeof(struct node));

    if(*start==NULL)
    {
      newnode->data=data;
      newnode->next=(*start);
      *start=newnode;
   }
  else
  {
    newnode->data=data;
    newnode->next=(*start);
    (*start)=newnode;
  }

}

int peekFirst( struct node *start)
{
   if(start==NULL)
      return NULL;
  else
      return start->data;
}

int pop(struct node **start)

{   struct node *top=*start;
   if(*start==NULL)
  {
       return NULL;
  }
  else
  {
   (*start)=(*start)->next;
   top->next=NULL;
  }
   return top->data;

}

int get_min_stck(struct node **start)
{
   struct node *temp=NULL;
   struct node *q=(*start);
   int minE=peekFirst(q);
//   printf(" \n %d",minE);
   int tmp_data;

    while(q!=NULL)
    {
       tmp_data=pop(&q);
       if(tmp_data<minE)
       {
         minE=tmp_data;
       }

      push(&temp,tmp_data);
  }
  struct node *tmp;
*start=tmp=NULL;
int rev_data;

while(temp!=NULL)
{
  rev_data=pop(&temp);
  push(&tmp,rev_data);
}

*start=tmp;
return minE;
}

void main()
{
   struct node *start=NULL;

  push(&start,5);
  push(&start,4);
  push(&start,3);
  push(&start,2);
  push(&start,6);

    printlist(start);
    printf("\n");



int min_ele=get_min_stck(&start);

printf("min element : %d \n",min_ele);

printlist(start);
printf("\n");


}
