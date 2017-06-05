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

  class PrintLeftView
  {

      Node root;
      PrintLeftView()
      {
        root=null;
      }

    void printLeftViewHelper()
    {

     printLeftView(root);

    }

    void printLeftView(Node node)
   {

      if(node!=null)
      {

          System.out.print("  "+node.data);
          printLeftView(node.left);

        if(node.right!=null)       //to print right if left node is null so right node can be seen
        {
          System.out.print("  "+node.data);
          printLeftView(node.right);

        }

       }

  }


      public static void main(String args[])
        {
          PrintLeftView tree=new PrintLeftView();
          tree.root= new Node(1);
          tree.root.right=new Node(3);
          tree.root.left=new Node(2);
          tree.root.left.left=new Node(4);
          tree.root.left.right=new Node(5);
          tree.root.right.left=new Node(6);
          tree.root.right.left.right=new Node(8);
          tree.root.right.right=new Node(7);
          tree.root.right.right.right=new Node(9);

          tree.printLeftViewHelper();

       }



}
