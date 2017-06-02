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

  public class BinaryTreeIsSumProperty
  {
    Node root;
    BinaryTreeIsSumProperty()
    {
      root=null;
    }

    public int isSumProperty(Node node)
    {

      int left_data=0;
      int right_data=0;

      if(node==null || (node.left==null && node.right==null))
      return 1;

 else{
      if(node.left!=null)
      {
         left_data=node.left.data;
       }

      if(node.right!=null)
      {
          right_data=node.right.data;
       }

      if((node.data==left_data+right_data) && (isSumProperty(node.left)!=0) && isSumProperty(node.right)!=0)
      return 1;

      else
      return 0;
   }

   }

    int isSumPropertyHelper()
    {
      return isSumProperty(root);
    }

    public static void main(String args[])
    {
      BinaryTreeIsSumProperty tree=new BinaryTreeIsSumProperty();

      tree.root= new Node(10);
      tree.root.right=new Node(2);
      tree.root.right.right=new Node(2);
      tree.root.left=new Node(8);
      tree.root.left.left=new Node(3);
      tree.root.left.right=new Node(5);
      int d=tree.isSumPropertyHelper();

      if(d==1)
        System.out.println("Sum Property holds :");
        else if(d==0)
          System.out.println("sum Property does not nold");

        }

  }
