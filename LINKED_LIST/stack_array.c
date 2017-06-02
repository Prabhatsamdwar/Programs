#include<stdio.h>
#include<stdlib.h>
#define MAX 10

int top=-1;
int stack[MAX];

void push(int item)
{
  if(top==MAX-1)
  {
  printf("\n stack overflow \n");
 }
  else
  {
    top=top+1;
    stack[top]=item;

  }
}

int pop()
{
  int store;
  if(top==-1)
  {
    printf("\n stack underflow\n");
  }
 else
 {
   store=stack[top];
    top=top-1;
}

return store;

}

int peekFirst()
{
  if(top==MAX-1)
   return 1;
   else
    return 0;
}
int isEmpty()
{
   if(top==-1)
     return 1;
     else
        return 0;
}


void main()
{
  int n=5;
  int i=0;
  int item;
for(i=0;i<n;i++)
{
  scanf("%d\n",&item);
  push(item);

}
printf("\n");

for(i=0;i<=top;i++)
{
  printf("%d ",stack[i]);

}
printf("\n poped= %d  \n",pop());

for(i=0;i<=top;i++)
{
  printf("%d ",stack[i]);

}

}
