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


 class PrintAllAncestors
 {
     Node root;
     PrintAllAncestors()
     {
       root=null;
     }

   void printAncestorsHelper()
   {
     int k=8;
     printAncestorsUtil(root,k);
   }

 boolean printAncestorsUtil(Node node, int target)
 {
     if(node==null)
       return false;

     if(node.data==target)
     {
       return true;
     }

     if( printAncestorsUtil(node.left,target) ||printAncestorsUtil(node.right,target))
     {
       System.out.print(" "+node.data);
       return true;
     }

 return false;
 }



    public static void main(String args[])
    {
      PrintAllAncestors tree=new PrintAllAncestors();
      tree.root= new Node(1);
      tree.root.right=new Node(3);
      tree.root.left=new Node(2);
      tree.root.left.left=new Node(4);
      tree.root.left.right=new Node(5);
      tree.root.right.left=new Node(6);
      tree.root.right.left.left=new Node(8);
      tree.root.right.right=new Node(7);
      tree.root.right.right.right=new Node(9);

      tree.printAncestorsHelper();

   }

}
