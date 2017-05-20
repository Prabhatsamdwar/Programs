#include<stdio.h>
#include<stdlib.h>
#include "create_node.h"

struct node *copy_ll(struct node *start1)
{
   

	struct node *ptr;
	struct node *tail,*head;

	ptr=start1;
	tail = head = NULL;

	while(ptr!=NULL){
		if(head==NULL){
			head=(struct node*)malloc(sizeof(struct node));	
			head->data=ptr->data;
		        tail=head;
		        tail->next=NULL;
		}else{ 
			tail->next=(struct node*)malloc(sizeof(struct node));
			tail->next->data=ptr->data;
			tail=tail->next;
			tail->next=NULL;
		}

		ptr=ptr->next;
	}

	return head;

}



void main()
{
struct node *start1=NULL;
struct node *start2=NULL;

create_node(&start1,11);
create_node(&start1,21);
create_node(&start1,5);
create_node(&start1,8);
create_node(&start1,14);

start2 = copy_ll(start1);
printf("\n Original \n");
printlist(start1);
printf("\n Copied List\n");
printlist(start2);


}
