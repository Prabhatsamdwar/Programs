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

public class SpiralLevelOrder
{

  Node root;

  SpiralLevelOrder()
  {
    root=null;
  }

int height (Node node)
{
   if(node==null)
   return 0;

   int left=height(node.left);
   int right=height(node.right);

   return 1+ Math.max(left ,right);


}

void printSpiralLevelOrder(Node root1,int level,boolean ltr)
{
   if(root1==null)
   return;

   if(level==1)
   {
     System.out.print(root1.data+"  ");
   }

   else if(level>1)
  {
  if(ltr)
  {
  printSpiralLevelOrder(root1.left,level-1,ltr);
  printSpiralLevelOrder(root1.right,level-1,ltr);
  }
  else
    {
        printSpiralLevelOrder(root1.right,level-1,ltr);
        printSpiralLevelOrder(root1.left,level-1,ltr);

    }

  }

}

boolean ltr=false;
public void printLevelOrder( Node node)
{
   int h=height(node);
   int i;
  for(i=1;i<=h;i++)
  {
    printSpiralLevelOrder(node,i,ltr);
    System.out.println();
    ltr=!ltr;
  }

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

void printSpiralLevel()
{
   printLevelOrder(root);
}

public static void main(String[] args)
  {
      SpiralLevelOrder tree= new SpiralLevelOrder();

      tree.root= new Node(1);
      tree.root.left=new Node(2);
      tree.root.left.left=new Node(4);
      tree.root.left.right=new Node(5);
      tree.root.right= new Node(3);
      tree.root.right.left= new Node(6);
      tree.root.right.right= new Node(8);
      tree.inOrder();
      System.out.println("Spiral level Order traversal");
      tree.printSpiralLevel();


  }


}
