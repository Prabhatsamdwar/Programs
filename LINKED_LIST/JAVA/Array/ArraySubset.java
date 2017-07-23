import java.util.*;
import java.io.*;

class ArraySubset
{
    boolean arraySubsetUtil(int ar1[],int ar2[],int n1,int n2)
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        int i,j;
        boolean flag=false;

        for(i=0;i<n1;i++)
        {
            hs.add(ar1[i]);
        }

        for(i=0;i<n2;i++)
        {
            if(hs.contains(ar2[i]))
                flag=true;
            else
                flag=false;
        }
        return flag;

    }

    public static void main(String args[])
    {
        int ar1[]={11, 1, 13, 21, 3, 7};
        int n1=ar1.length;
        int ar2[]={11,3,7,5};
        int n2=ar2.length;

        ArraySubset as=new ArraySubset();
        boolean b=as.arraySubsetUtil(ar1,ar2,n1,n2);

        if(b==true)
        System.out.println("true");
        else
            System.out.println("false");
    }
}