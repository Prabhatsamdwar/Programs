#include<stdio.h>
#include<stdlib.h>
#include "create_tree_node.h"

 int size_of_tree(struct node *root)
{
   if(root==NULL)
      return 0;

  else
  {
   int left=size_of_tree(root->left);
   int right=size_of_tree(root->right);


   return left+right+1;
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
  printf("\n");

  printf("size_of_tree=%d ",size_of_tree(root));

}
