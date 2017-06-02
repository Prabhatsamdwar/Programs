

struct node
{
 int data;
 struct node *next;

};

struct node *create_node(struct node **head,int data)
{
  struct node *newnode;
  newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=data;
  newnode->next=(*head);
  (*head)=newnode;


}

void printlist(struct node *head)
{
  if(!head)
     return;

   while(head!=NULL)
      {
        printf("%d  ",head->data);
        head=head->next;
      }

}
