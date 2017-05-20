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
 printf("\n");

}

int count_node(struct node *head)
{
   int count=0;
   
   if(head==NULL)
        printf("list is empty");
  
   while(head!=NULL)
 {
    count++;
    head=head->next;
 }

return count;

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

printf("\n No of nodes in the list :  %d \n",count_node(start));

}
