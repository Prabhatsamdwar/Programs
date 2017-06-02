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
    public class TopView
   {
     Node root;
    HashSet<Integer> set= new HashSet<>();

      TopView()
      {
        Node root=null;

      }


     void printTopView()
     {

       int hd=0;
       printTopViewhelper(root,hd);

     }

   void printTopViewhelper(Node node,int hd)
   {
       if(node==null)
        return;

      if(!set.contains(hd))
      {
       System.out.print(" "+node.data);
       set.add(hd);

     }

    printTopViewhelper(node.left,hd-1);
    printTopViewhelper(node.right,hd+1);

  }


    public static void main(String args[])
    {
      TopView tree=new TopView();
      tree.root= new Node(1);
      tree.root.right=new Node(3);
      tree.root.left=new Node(2);
      tree.root.left.left=new Node(5);
      tree.root.left.right=new Node(4);
      tree.root.right.left=new Node(6);
      tree.root.right.right=new Node(7);

      tree.printTopView();

   }

}
