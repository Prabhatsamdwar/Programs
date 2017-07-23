import java.io.*;
import java.util.*;

class ProdArray
{

    int prod[]=new int[5];
    void productUtil(int ar[],int x)
    {

        int prod1=1;
        for(int i=0;i<x;i++)
        {
            prod[i]=1;
        }
        int j=0;
        int i;

        while(j<x)
        {
            for(i=0;i<x;i++)
            {
                if(i==j)
                {
                    continue;
                }
                prod1=prod1*ar[i];

            }
            prod[j]=prod1;
            j++;
        }

    }

    void printProdArray(int x)
    {
        for(int i=0;i<x;i++)
            System.out.println(prod[i]+" ");
    }
    void productHelper(int ar[],int x)
    {


    }

    public static void main(String args[])
    {
        int ar[]={10,3,5,6,2};
        int n=ar.length;
        ProdArray2 pa= new ProdArray2(n);
        pa.productHelper(ar,n);


    }

}