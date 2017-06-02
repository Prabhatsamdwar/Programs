#include<stdio.h>
#include<stdlib.h>
#include "create_tree_node.h"
#include<stdbool.h>

bool sametree(struct node *root1,struct node *root2)
{
  if(root1==NULL && root2== NULL)
  return true;
  if(root1==NULL || root2==NULL)
  return false;

  return (root1->data==root2->data) && sametree(root1->left,root2->left) && sametree(root1->right,root2->right);

}

void main()
{
  struct node *root1=NULL;
  struct node *root2=NULL;

  root1=create_node(10);
  root1->left=create_node(16);
  root1->right=create_node(15);
  root1->right->left=create_node(18);

  root2=create_node(10);
  root2->left=create_node(16);
  root2->right=create_node(15);
  root2->right->left=create_node(33);

  bool d=sametree(root1,root2);
  if(d==true)
  printf("same tree\n");
  else
  printf("tree is not same \n");


}
