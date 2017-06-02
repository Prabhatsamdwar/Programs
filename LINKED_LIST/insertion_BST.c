#include<stdio.h>
#include<stdlib.h>
#include "create_tree_node.h"

void insertion_bst(struct node *root,int d)
{
  struct node *newnode,*current,*parent=NULL;

  newnode=(struct node *)malloc(sizeof(struct node));
  newnode->data=d;

   if(root==NULL)
     return;

  current=root;

  while(current!=NULL)
  {
    parent=current;
    if(current->data > d )
    {
        current=current->left;
    }
    else
    {
     current=current->right;
    }
  }

if(parent->data > d)
{
  parent->left=newnode;
}
else
    parent->right=newnode;


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

   printf("\n");
   inorder(root);

   insertion_bst(root,7);
   printf("\n");
   inorder(root);


}
