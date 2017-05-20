#include<stdio.h>
#include<stdlib.h>

struct node{

int data;
struct node *next;

};

struct node *create_node(struct node** head,int data)
{
struct node *newnode=(struct node *)malloc(sizeof(struct node));

newnode->data=data;

newnode->next=(*head);
(*head)=newnode;

}

void reverse_print(struct node *head)
{
   if(head==NULL)
     return;


     reverse_print(head->next);
     printf("%d  ",head->data);  


}

void printlist(struct node *head)
{
  if(!head)
     return;

   while(head!=NULL)
      {
        printf("%d  ",head->data);
        head=head->next;
      }

}

void main()
{
struct node *start=NULL ;

create_node(&start,2);
create_node(&start,8);
create_node(&start,9);
create_node(&start,13);
create_node(&start,11);
create_node(&start,7);

printlist(start);
printf("\n");

reverse_print(start);

}
