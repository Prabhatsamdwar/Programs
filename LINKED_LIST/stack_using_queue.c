/*implementation of stack using queue */

 #include<stdio.h>
 #include<stdlib.h>
 #include "create_node.h"

  void enqueue(struct node *start,int data)
  {
     struct node *q=start;
     struct node *newnode=(struct node *)malloc(sizeof(struct node));
     while(q->next!=NULL)
     {
        q=q->next;
     }
      newnode->data=data;
      newnode->next=NULL;
      q->next=newnode;

  }

 int dequeue(struct node **start)
{
  struct node *p=*start;
  (*start)=(*start)->next;
   p->next=NULL;

   return p->data;

}

struct node *stack_push(struct node *start,int data)
{
    enqueue(start,data);
    int dedata;
    struct node *ptr=start;

    while (ptr->next!=NULL && ptr->data!=data)
     {
       dedata=dequeue(&ptr);
       enqueue(ptr,dedata);
     }

  start=ptr;

return start;

}

int stack_pop(struct node **start)
{        struct node *x=*start;
        int d=dequeue(&x);
         (*start)=x;
         return (d);
}

void main()
{
  struct node *start=NULL;

  create_node(&start,5);
  create_node(&start,4);
  create_node(&start,3);
  create_node(&start,2);
  create_node(&start,1);

 printf("\n");
 printlist(start);

start=stack_push(start,10);
printf("\n stack after push using queue \n");
printlist(start);

int pop_data=stack_pop(&start);

printf("\n stack after pop using queue \n");
printlist(start);

printf("\n poped element is : %d",pop_data);

}
