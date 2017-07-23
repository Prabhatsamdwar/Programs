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

class BottomViewBinaryTree
{
    Node root;

    BottomViewBinaryTree()
    {
        root=null;
    }

    ArrayList<Integer> al=new ArrayList<Integer>();

    void bottomViewUtil(Node node, int height, int d)
    {
        if(node==null)
        {
            return;
        }

        if(((d==height-1 && (node.left!=null || node.right!=null))) || (node.left==null && node.right==null))
        {
            al.add(node.data);
        }


        else
        {
            bottomViewUtil(node.left,height,d+1);
            bottomViewUtil(node.right,height,d+1);
        }


    }


    void bottomViewHelper()
    {   int height=3;
        int d=0;
        bottomViewUtil(root,height,d);
        printView();
    }

    void printView()
    {
        Iterator i= al.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+"  ");
        }

    }



    public static void main(String args[])
    {
        BottomViewBinaryTree tree= new BottomViewBinaryTree();
        tree.root=new Node(20);
        tree.root.left=new Node(8);
        tree.root.right=new Node(22);
        tree.root.right.right=new Node(25);
        tree.root.left.right=new Node(3);
        tree.root.left.left= new Node(5);
        tree.root.left.right.left=new Node(10);
        tree.root.left.right.right=new Node(14);

        tree.bottomViewHelper();


    }

}



