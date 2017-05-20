#include<stdio.h>
#include<stdlib.h>
#include "create_node.h"

 


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


}
