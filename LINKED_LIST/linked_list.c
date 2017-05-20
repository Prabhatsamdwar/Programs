#include<stdio.h>
#include<stdlib.h>

struct node
{
  int data;
  struct node *next;


};

struct node *create_node(struct node ** start, int data)
{
   struct node *newnode=(struct node *)malloc(sizeof(struct node));
   newnode->data=data;
   newnode->next=(*start);
   (*start)=newnode;


}



void printList(struct node *head)
{
  if(head==NULL)
       printf("list is empty \n");
  
  while(head!=NULL)
  {
     printf("%d  ",head->data);
     head=head->next;
  }

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


printList(start);

}
