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

struct node *insert_node(struct node **start,int data, int pos)
{
   struct node *newnode=(struct node*)malloc(sizeof(struct node));
    
     int k=1;
     struct node *p,*q;
     p=*start;
   
  newnode->data=data;
    
   if(pos==1)
  {
      newnode->next=(*start);
      *start=newnode;
   }
 
 else{
   while(p!=NULL && k<pos)
  {
    k++;
    q=p;
    p=p->next;
   }
   
  q->next=newnode;
  newnode->next=p;
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

insert_node(&start,10,1);

printList(start);

}
