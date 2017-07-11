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

    class RootToLeafSum2
    {
        List<Integer> ls=new ArrayList<Integer>();
        Node root;
        RootToLeafSum2()
        {
            root=null;
        }

        boolean rootToLeafUtil(Node node,int sum,List<Integer> ls)
        {

            if(node==null)
                return false;

            if(node.left==null && node.right==null)
            {
                if(node.data==sum)
                {
                    ls.add(node.data);
                    return true;
                }
                else
                    return false;
            }

            if(rootToLeafUtil(node.left,sum-node.data,ls))
            {
                ls.add(node.data);
                return true;
            }

            if(rootToLeafUtil(node.right,sum-node.data,ls))
            {
                ls.add(node.data);

                return true;
            }

            return false;

        }

        boolean rootToLeafHelper(int sum)
        {
            return rootToLeafUtil(root,sum,ls);
        }

            void printList()
            {
                ListIterator li=ls.listIterator();
                while(li.hasNext())
                {
                    System.out.print(li.next()+"  ");
                }


            }



    public static void main(String args[])
    {
        RootToLeafSum2 tree= new RootToLeafSum2();
        tree.root= new Node(10);
        tree.root.right=new Node(5);
        tree.root.left=new Node(6);
        tree.root.left.right=new Node(-3);
        tree.root.right.right=new Node(11);
        tree.root.right.left=new Node(6);

        boolean b=tree.rootToLeafHelper(26);
        if(b==true)
        {
            System.out.println("sum exists");
            tree.printList();
        }
        else
        {
            System.out.println("sum doesnot exist");
        }

    }




    }