#include<stdio.h>
#include<stdlib.h>


struct node
{
 int data;
 struct node *left;
 struct node *right;
};

struct node * create_node(int data)
{
 struct node *q;
 struct node *newnode=(struct node*)malloc(sizeof(struct node));
 newnode->data=data;
 newnode->left=NULL;
 newnode->right=NULL;
 q=newnode;

 return q;
}

void preorder(struct node *root)
{
   if(root==NULL)
     return;

  else
     {
       printf("%d  ",root->data);
       preorder(root->left);
       preorder(root->right);
     }

}

   void main()
 {
     struct node *root=NULL;

     root=create_node(10);
     root->left=create_node(15);
     root->left->left=create_node(3);
     root->left->right=create_node(6);
     root->left->left->left=create_node(5);

     root->right=create_node(30);
     root->right->right=create_node(2);
     root->right->right->left=create_node(9);
     root->right->right->right=create_node(8);

     preorder(root);


   }
