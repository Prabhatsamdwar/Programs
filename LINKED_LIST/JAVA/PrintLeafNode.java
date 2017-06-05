import java.util.*;
import java.io.*;

class Node{

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

  class PrintLeafNode
  {
      Node root;
      PrintLeafNode()
      {
        root=null;
      }

    void printLeafHelper()
    {

     printLeaf(root);

    }

    void printLeaf(Node node)
   {
      if(node==null)
      return;

      else{
          printLeaf(node.left);

          if(node.left==null & node.right==null)
           System.out.print("  "+node.data);

           printLeaf(node.right);
       }

    }


      public static void main(String args[])
        {
          PrintLeafNode tree=new PrintLeafNode();
          tree.root= new Node(1);
          tree.root.right=new Node(3);
          tree.root.left=new Node(2);
          tree.root.left.left=new Node(4);
          tree.root.left.right=new Node(5);
          tree.root.right.left=new Node(6);
          tree.root.right.left.right=new Node(8);
          tree.root.right.right=new Node(7);
          tree.root.right.right.right=new Node(9);

          tree.printLeafHelper();

       }



}
