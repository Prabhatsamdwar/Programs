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

public class LinkedList
{
     Node head;
     public void createNode(int new_data)
     {
      Node new_node=new Node(new_data);
      new_node.next=head;
      head=new_node;
     

  public int getCount()
  {
     int count=0;
     Node temp=head;
  while(temp.next!=null)
  {
     count++;
     temp=temp.next;
  }

return count;
 }

  public void printList()
  {
     Node q=head;
     while (q.next)
     {
       System.out.print(q.data+" ");
       q=q.next;

     }

 }

 public static void main(String args[])
 {
   LinkedList list= new LinkedList();

   list.createNode(5);
   list.createNode(9);
   list.createNode(3);
   list.createNode(1);
   list.createNode(7);
   System.out.println("list :");
   list.printList();
   System.out.print("count= ",getCount());

 }

}
