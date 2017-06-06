import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int item)
    {
      data=item;
      left=null;
      right=null;
    }
}


 class PrintKthNode
 {
     Node root;
     PrintKthNode()
     {
       root=null;
     }

   void printKthHelper()
   {
     int k=3;
     printKthUtil(root,k);
   }

     void printKthUtil(Node node, int k)
     {
       if(node==null){return;}

       if(k==0)
       {
         System.out.print(" "+node.data);
         return;
       }
       else
       {
         printKthUtil(node.left,k-1);
         printKthUtil(node.right,k-1);
       }

     }

    public static void main(String args[])
    {
      PrintKthNode tree=new PrintKthNode();
      tree.root= new Node(1);
      tree.root.right=new Node(3);
      tree.root.left=new Node(2);
      tree.root.left.left=new Node(4);
      tree.root.left.right=new Node(5);
      tree.root.right.left=new Node(6);
      tree.root.right.left.left=new Node(8);
      tree.root.right.right=new Node(7);
      tree.root.right.right.right=new Node(9);

      tree.printKthHelper();

   }

}
