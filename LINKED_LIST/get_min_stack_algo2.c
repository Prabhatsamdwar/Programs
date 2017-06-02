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

int get_min_stack()
{
    struct node *start=NULL;

      push(&start,3);
      int data;
      int minE=peekFirst(start);
      int new_data;
      printf("\n enter data to be inserted\n");
      int n=5;
      while(n>0)
      {
          scanf("%d  ",&data);

          if(data>=minE)
          {
            push(&start,data);

          }
       else
       {
            new_data=(2*data-minE);
            minE=data;
            push(&start,new_data);

       }
    n--;

      }

     //printf("\n Inserted elements in stack are: \n 3 5 2 1 1 -1 \n");
      printf("\n modified element after push operation \n");
      printlist(start);
  /************************code for pop*******************/
  struct node *q=start;
  int y;

   while(q->next!=NULL)
   {
     y=pop(&q);   /*pointer is updated every time so no q=q->next*/
     if(y<minE)
     {
        minE=2*minE-y;
     }

 printf("  \n%d  ",minE);

   }

    return minE;
}

void main()
{
int min_ele=get_min_stack();

printf("\n min element : %d \n",min_ele);


}
