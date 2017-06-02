#include<stdio.h>
#include<stdlib.h>
#include "create_node.h"

void push(struct node **start,int data)
{

   struct node *newnode=(struct node *)malloc(sizeof(struct node));

    newnode->data=data;
    newnode->next= (*start);
    (*start)=newnode;
 }

int pop(struct node **start)

{   struct node *top=(*start);
   if((*start)==NULL)
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

int peekFirst( struct node *start)
{
   if(start==NULL)
      return;
  else
      return start->data;
}

int isEmpty(struct node *start)
{
   if(start==NULL)
    return 1;
  else
  return 0;
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

  push(&start,10);

  printf("\n");
  printlist(start);

  printf("poped element is : %d \n",pop(&start));

  printf("after pop\n");
  printlist(start);
  printf("poped element is : %d \n",pop(&start));
  printf("\n");

 printlist(start);


  if(isEmpty(start)==1)

     printf("\n stack is empty \n");
     else
     printf("not empty \n");

printf("top element is : %d ",peekFirst(start));

}
