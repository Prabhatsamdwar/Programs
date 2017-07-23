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
    class SameTree
    {   Node root;
        Node root2;
        SameTree()
        {
            root=null;
            root2=null;
        }

        boolean sameTreeUtil(Node node1, Node node2)
        {
            if(node1==null && node2==null)
            {
                return true;
            }

            if(node1!=null && node2!=null)
            {
                return((node1.data==node2.data) && sameTreeUtil(node1.left,node2.left) && sameTreeUtil(node1.right,node2.right));


            }
            else
                return false;
        }

        boolean HelperUtil()
        {
            return sameTreeUtil(root,root2);
        }

    public static void main(String args[])
    {
        SameTree tree1=new SameTree();


        tree1.root= new Node(2);
        tree1.root.right=new Node(3);
        tree1.root.left=new Node(4);

        tree1.root2= new Node(2);
        tree1.root2.right=new Node(3);
        tree1.root2.left=new Node(4);

        boolean b=tree1.HelperUtil();
        if(b==true)
            System.out.println("Sametree");
        else
            System.out.println("not a Sametree");

    }

}
