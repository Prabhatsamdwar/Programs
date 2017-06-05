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

class RootToLeafSum
{
      Node root;
      RootToLeafSum()
      {
        root=null;
      }

      List<Integer> result=new ArrayList<>();

      boolean Helper()
      {
        int sum=24;
        return rootToLeafSumUtil(root,sum,result);

      }

      boolean rootToLeafSumUtil(Node node,int sum,List<Integer> result)
      {
        if(node==null)
        return false;

        if(node.left==null && node.right==null)
        {
          if(node.data==sum)
          {
          result.add(node.data);
          return true;
          }
          else{ return false;}
        }

        if(rootToLeafSumUtil(node.left,sum-node.data,result))
        {
        result.add(node.data);
        return true;
       }
       if(rootToLeafSumUtil(node.right,sum-node.data,result))
       {
         result.add(node.data);
         return true;
       }
    return false;

   }


   void printNode()
     {
      for(int a:result)
      {
        System.out.print("  "+a);
      }
    }

      public static void main(String args[])
        {
          RootToLeafSum tree=new RootToLeafSum();
          tree.root= new Node(1);
          tree.root.right=new Node(3);
          tree.root.left=new Node(2);
          tree.root.left.left=new Node(4);
          tree.root.left.right=new Node(5);
          tree.root.right.left=new Node(6);
          tree.root.right.left.right=new Node(8);
          tree.root.right.right=new Node(7);
          tree.root.right.right.right=new Node(9);

          boolean a=tree.Helper();
          if(a==false)
          System.out.println("sum not found");
          else
          {
            System.out.println("sum exists : nodes are:  ");
          tree.printNode();
          }
       }
   }
