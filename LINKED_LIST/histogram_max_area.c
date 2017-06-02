#include<stdio.h>
#include<stdlib.h>
#define MAX 10

int top=-1;
int stack[MAX];

void push(int item)
{
  if(top==MAX-1)
  {
  }
  printf("\n stack overflow \n");
  else
  {
    top=top+1;
    stack[top]=item;

  }
}

int pop()
{
  if(top==-1)
  {
    printf("\n stack underflow\n");
  }
 else
 {
    int store=stack[top];
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
  push(scanf("%d\n",&item));

}
printf("\n");

for(i=0;i<n;i++)
{
  printf("%d ",stack[i]);

}


}
