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
  public class VerticalPrint
{    Node root;

      VerticalPrint()
      {
        root=null;
      }

   Map<Integer,List<Integer>> hm= new TreeMap< >();

    void printVertical(Node node)
    {
         int hd=0;
         printVerticalUtil(node,hd);
         printHashMap();
    }

   void printVerticalUtil(Node node,int hd)
   {
      if(node==null)
      return;

      if(hm.containsKey(hd))
      {
        List <Integer> list=hm.get(hd);
        list.add(node.data);
        hm.put(hd,list);
      }else {
        List<Integer> list= new ArrayList<>();
        list.add(node.data);
        hm.put(hd,list);
      }

      printVerticalUtil(node.left,hd-1);
      printVerticalUtil(node.right,hd+1);

  }
void printHashMap()
 {
  for(Map.Entry<Integer,List<Integer>> entry:hm.entrySet())
  {
    List<Integer> list=entry.getValue();
    for(int a:list)
    {
          System.out.print("  "+a);

    }
    System.out.println();

  }
}

    void printVerticalHelper()
    {
       printVertical(root);

    }


    public static void main(String args[])
    {
      VerticalPrint tree=new VerticalPrint();
      tree.root= new Node(1);
      tree.root.right=new Node(3);
      tree.root.left=new Node(2);
      tree.root.left.left=new Node(4);
      tree.root.left.right=new Node(5);
      tree.root.right.left=new Node(6);
      tree.root.right.left.right=new Node(8);
      tree.root.right.right=new Node(7);
      tree.root.right.right.right=new Node(9);

      tree.printVerticalHelper();

   }

}
