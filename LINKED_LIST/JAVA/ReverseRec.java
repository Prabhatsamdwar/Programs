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

 public class ReverseRec
{
        Node head;

	public void createNode(int new_data)
	{
           Node new_node= new Node(new_data);

	   new_node.next=head;
           head=new_node;
	}

   public void revRec()
   {
       revList(head);

   }
         public void revList(Node cur)
      {


        if(cur==null)
           return;

         if(cur.next==null)
         {
            this.head=cur;
             return;
         }

      revList(cur.next);

	cur.next.next=cur;
        cur.next=null;



  }


     public void printList()
     {
        while(head!=null){

 	System.out.print(head.data+ " ");
        head=head.next;
      }

     }

  public static void main(String args[])
{
   ReverseRec rev =new ReverseRec();

    rev.createNode(5);
    rev.createNode(8);
    rev.createNode(4);
    rev.createNode(7);
    rev.createNode(6);

    System.out.println(" before Reverse");
    rev.printList();

     System.out.println();
     rev.revRec();

     System.out.println("after reverse");

     rev.printList();


   }

}
