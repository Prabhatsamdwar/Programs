import java.io.*;
import java.util.*;

class Node
{
   int data;
   Node next;
   Node(int d)
   {
     data=d;
     next=null;

   }
}

public class IntersectionNode
{
     Node head;
     Node head2;

     public void createNode(int new_data)
     {
      Node new_node=new Node(new_data);
      new_node.next=head;
      head=new_node;
     }

     public void createNode2(int new_data)
     {
      Node new_node=new Node(new_data);
      new_node.next=head2;
      head2=new_node;
     }


  public void printList()
  {
     Node q=head;
     while(q!=null)
     {
       System.out.print(q.data+" ");
       q=q.next;

     }

 }

   public void printList2()
   {
      Node q=head2;
      while(q!=null)
      {
        System.out.print(q.data+" ");
        q=q.next;

      }

  }

public void createIntersection()
{
    Node ptr=head2;
    Node qtr=head;

  while(ptr!=null && ptr.next!=null)
  {
    ptr=ptr.next;
    System.out.println(" "+ptr.data);

  }
  while(qtr!=null && qtr.data!=8)
  {
    qtr=qtr.next;

  }

  System.out.println(" "+ptr);
  System.out.println(" "+qtr);

  //ptr.next=qtr;

}

 public static void main(String args[])
 {
   IntersectionNode list= new IntersectionNode();
   IntersectionNode list2=new IntersectionNode();

   list.createNode(9);
   list.createNode(8);
   list.createNode(7);
   list.createNode(6);
   list.createNode(5);
   list.createNode(4);
   list.createNode(3);
   list.createNode(2);
   list.createNode(1);

   list2.createNode2(7);
   list2.createNode2(6);
   list2.createNode2(5);


   list.printList();
   //System.out.println();
   //list2.printList2();

   new IntersectionNode().createIntersection();
   System.out.println();
   list2.printList2();


 }

}
