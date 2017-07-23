import java.util.*;
import java.io.*;

class ArrayIntersectionUnion
{
    void arrayIntersectionUnionUtil(int ar1[],int ar2[],int n1,int n2)
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        HashSet<Integer> hs2=new HashSet<Integer>();
        int i,j;
        boolean flag=false;

        for(i=0;i<n1;i++)
        {
            hs.add(ar1[i]);

        }

        for(i=0;i<n2;i++)
        {

            hs.add(ar2[i]);
        }


        for(i=0;i<n1;i++)
        {
            hs2.add(ar1[i]);
        }


        System.out.println("Intersection: ");
        Iterator<Integer> it=hs.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

        System.out.println("\n Union: ");
        for(i=0;i<n2;i++)
        {
            if(hs2.contains(ar2[i]))
            {
                System.out.print(ar2[i]+" ");
            }
        }


    }

    public static void main(String args[])
    {
        int ar1[]={1, 3, 4, 5, 7};
        int n1=ar1.length;
        int ar2[]={2, 3, 5, 6};
        int n2=ar2.length;

        ArrayIntersectionUnion as=new ArrayIntersectionUnion();
        as.arrayIntersectionUnionUtil(ar1,ar2,n1,n2);


    }
}