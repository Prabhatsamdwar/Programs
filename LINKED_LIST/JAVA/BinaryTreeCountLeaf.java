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

  public class BinaryTreeCountLeaf
  {
    Node root;
    BinaryTreeCountLeaf()
    {
      root=null;
    }

    public int countLeaf(Node node)
    {
       if(node==null)
          return 0;


      if(node==null || (node.left==null && node.right==null))
         return 1;

      else
      {
          return countLeaf(node.left)+countLeaf(node.right);
      }

    }

    int countLeafHelper()
    {
      return countLeaf(root);
    }

    public static void main(String args[])
    {
      BinaryTreeCountLeaf tree=new BinaryTreeCountLeaf();
      tree.root= new Node(1);
      tree.root.right=new Node(3);
      tree.root.left=new Node(2);
      tree.root.left.left=new Node(4);
      tree.root.left.right=new Node(5);

      System.out.println("no of leaf : "+tree.countLeafHelper());

    }

  }
