#include<stdio.h>
#include<stdlib.h>


struct node
{
    int element;
    struct node *next;
};



struct node* mergeList(struct node *list1, struct node *list2)
{
    struct node *root = NULL, *cur = NULL;

    if(list1 == NULL)
    {
        return list2;
    }

    if(list2 == NULL)
    {
        return list1;
    }

    while( (list1 != NULL) && (list2 != NULL) )
    {
        struct node *tmp = malloc(sizeof(struct node));
        if( list1->element  < list2->element )
        {
            tmp->element = list1->element;
            tmp->next = NULL;
            list1 = list1->next;
        }
        else
        {
            tmp->element = list2->element;
            tmp->next = NULL;
            list2 = list2->next;

        }
        if(root == NULL)
        {
            root = tmp;
            cur = root;
        }
        else
        {
            cur->next = tmp;
            cur = tmp;
        }


    }


    while(list1 != NULL)
    {
        struct node *tmp = malloc(sizeof(struct node));
        tmp->element = list1->element;
        tmp->next = NULL;
        cur->next = tmp;
        cur = tmp;
        list1 = list1->next;
    }
    while(list2 != NULL)
    {
        struct node *tmp = malloc(sizeof(struct node));
        tmp->element = list2->element;
        tmp->next = NULL;
        cur->next = tmp;
        cur = tmp;
        list2 = list2->next;
    }


    return root;

}



void findMid(struct node *root, struct node **list1, struct node **list2)
{

    struct node *slow;
    struct node *fast;
    printf("\nIn Findmis\n");
    if( (root == NULL) || (root->next == NULL) )
    {
        *list1 = root;
        *list2 = NULL;
        return;
    }
    else
    {

        slow =  root;
        fast = root->next;
        while (fast != NULL)
        {
            fast = fast->next;
            if(fast!=NULL)
            {
                slow = slow->next;
                fast = fast->next;
            }


        }


        *list1 = root;
        *list2 = slow->next;
        slow->next = NULL;

    }

}

void mergeSort(struct node **root)
{
    struct node *list1, *list2;
    struct node *head = *root;
    if( ( head  == NULL) || (head->next == NULL))
    {
        return;
    }


    findMid(head, &list1, &list2);

    if(list1 != NULL)
    printf("\nList1 = %d", list1->element);
    if(list2 != NULL)
    printf("\nList2 = %d", list2->element);
    mergeSort( &list1 );
    mergeSort( &list2 );

    *root = mergeList( list1, list2 );


}


void insertNodes(struct node **root, int key)
{
    struct node *tmp = malloc(sizeof(struct node));
    tmp->element = key;
    tmp->next = *root;
    *root = tmp;

}


void printList(struct node *root)
{
    while( root!= NULL)
    {
        printf("\n%d\n", root->element);
        root = root->next;
    }

}

int main(int argc, char *argv[])
{

    struct node *root1 = NULL;

    struct node *root2 = NULL;
    insertNodes( &root1, 1);
    insertNodes( &root1, 2);
    insertNodes( &root1, 3);
    insertNodes( &root1, 4);
    insertNodes( &root1, 5);
    printList(root1);
    mergeSort( &root1);
    printList(root1);
    return 0;

}
