import java.util.*;
import java.io.*;

class Node
{
  int data;
  Node left;
  Node right;

 Node(int d)
 {
   data=d;
   left=null;
   right=null;
 }

}

public class BinaryTree
{

  Node root;

  BinaryTree()
  {
    root=null;
  }

public void inOrder( Node root1)
{

   if (root1==null)
    return;

  inOrder(root1.left);
  System.out.print(root1.data+"  ");
  inOrder(root1.right);
}

void inOrder()
{
   inOrder(root);

}

public static void main(String[] args)
  {
      BinaryTree tree= new BinaryTree();

      tree.root= new Node(1);
      tree.root.left=new Node(2);
      tree.root.left.left=new Node(4);
      tree.root.left.right=new Node(5);
      tree.root.right= new Node(3);
      tree.root.right.left= new Node(6);
      tree.root.right.right= new Node(8);
      tree.inOrder();
  }


}
