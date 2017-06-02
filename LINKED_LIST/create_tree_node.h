
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

void postorder(struct node *root)
{
   if(root==NULL)
     return;

  else
     {
       postorder(root->left);
       postorder(root->right);
       printf("%d  ",root->data);
     }

}

void inorder(struct node *root)
{
   if(root==NULL)
     return;

  else
     {
       inorder(root->left);
       printf("%d  ",root->data);
       inorder(root->right);
     }

}
