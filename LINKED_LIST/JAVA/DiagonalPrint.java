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

 class DiagonalPrint
 {
     Node root;
     DiagonalPrint()
     {
       root=null;
     }

    Map<Integer,List<Integer>> map=new TreeMap<>();

     void printDiagonal(Node node)
     {
     int dd=0;
     printDiagonalUtil(node,dd);
     printHashMap();
     }

     void printDiagonalUtil(Node node, int dd)
     {
        if(node==null)
        return;

        if(!map.containsKey(dd))
        {
          List<Integer> list= new ArrayList<>();
          list.add(node.data);
          map.put(dd,list);

        }
        else{
         List<Integer> list=map.get(dd);
         list.add(node.data);
         map.put(dd,list);

        }

        printDiagonalUtil(node.left,dd+1);
        printDiagonalUtil(node.right,dd);

      }

      void printHashMap()
      {
        for(Map.Entry<Integer,List<Integer>> entry :map.entrySet())
         {
             System.out.println(entry.getKey()+"  "+entry.getValue());


         }

     }

    void printDiagonalHelper()
    {
       printDiagonal(root);

    }


    public static void main(String args[])
    {
      DiagonalPrint tree=new DiagonalPrint();
      tree.root= new Node(1);
      tree.root.right=new Node(3);
      tree.root.left=new Node(2);
      tree.root.left.left=new Node(4);
      tree.root.left.right=new Node(5);
      tree.root.right.left=new Node(6);
      tree.root.right.left.left=new Node(8);
      tree.root.right.right=new Node(7);
      tree.root.right.right.right=new Node(9);

      tree.printDiagonalHelper();

   }

}
