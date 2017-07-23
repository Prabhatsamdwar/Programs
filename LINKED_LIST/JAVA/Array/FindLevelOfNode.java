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

        class FindLevelOfNode
        {
            Node root;

            FindLevelOfNode()
            {
                root=null;
            }

            void findLevelUtil(Node node, int key, int d)
            {
                if(node==null)
                {
                    return;
                }

                if(node.data==key)
                {    d=d+1;
                    System.out.println("level is "+d);
                    return;
                }

                else
                {
                    findLevelUtil(node.left,key,d+1);
                    findLevelUtil(node.right,key,d+1);
                }


            }

            void findLevelHelper(int key)
            {
                int d=0;
                findLevelUtil(root,key,d);
            }

            public static void main(String args[])
            {
                FindLevelOfNode tree= new FindLevelOfNode();
                tree.root=new Node(1);
                tree.root.left=new Node(2);
                tree.root.right=new Node(3);
                tree.root.left.right=new Node(4);
                tree.root.left.left= new Node(5);

                tree.findLevelHelper(1);


            }

        }



