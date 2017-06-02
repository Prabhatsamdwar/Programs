#include<stdio.h>
#include<stdlib.h>
#include "create_tree_node.h"

struct node *search_in_bst(struct node *root,int key)
{
  if (root==NULL)
      return NULL;

  if(root->data==key)
  {
   return root;
  }

  else if(root->data < key)
    {
      search_in_bst(root->right,key);
    }
else
  {
    search_in_bst(root->left,key);

  }


}

void main()
{
  struct node *root=NULL;

  root=create_node(10);
  root->left=create_node(-5);
  root->left->left=create_node(-10);
  root->left->right=create_node(0);
  root->left->right->right=create_node(5);
  root->right=create_node(30);
  root->right->right=create_node(36);

 struct node *d=search_in_bst(root,-10);
  if(d!=NULL)
    printf("\n %d is present in tree \n",d->data);
  else
       printf("not found \n");

}
