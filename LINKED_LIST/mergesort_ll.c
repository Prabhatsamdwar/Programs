#include<stdio.h>
#include<stdlib.h>
#include "create_node.h"

struct node *getmiddle(struct node *start)
{
   struct node *slow=start;
   struct node *fast=start;

  while (slow!=NULL && fast!=NULL && fast->next!=NULL)
  {
   slow=slow->next;
   fast=fast->next->next;
 }

return slow;
}

struct node* merge(struct node *a, struct node *b)
{
    struct node *sortedlist=NULL;

   while (a->data !=NULL && b->data!=NULL)
   {
      if(a->data <b->data)
      {



      }





   }








}


struct node  *mergesort(struct node *start)
{

 if(start==NULL || start->next==NULL)
 {
   return start;
 }
struct node *middle=getmiddle(start);
struct node *secondhalf=middle->next;
middle->next=NULL;

struct node *left=mergesort(start);
struct node *right=mergesort(secondhalf);

return merge(left, right);


}

void main()
{
struct node *start=NULL;
 create_node(&start,5);
 create_node(&start,8);
 create_node(&start,9);
 create_node(&start,3);
 create_node(&start,7);

printf("\n list before sorting \n");

printlist(start);
printf("after sorting \n");
printlist(mergesort(start));


}
