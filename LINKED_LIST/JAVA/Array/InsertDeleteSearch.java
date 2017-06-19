import java.io.*;
import java.util.*;

public class InsertDeleteSearch
{
   int insertElement(int ar[],int n,int capacity,int item)
   {
     if(n>=capacity)
      return 0;

      ar[n]=item;

      return n+1;

   }
   int deleteElement(int ar[], int n,int pos)
   {
     int i;
     int j;

     if(n<0)
     return 0;

     for(j=pos;j<n;j++)
     {
      ar[j]=ar[j+1];
     }

    return n-1;

   }

public static void main(String args[])
{
    int [] ar=new int[20];

    ar[0]=6;
    ar[1]=4;
    ar[2]=3;
    ar[3]=9;
    ar[4]=5;
    ar[5]=1;

    int n=6;
    int capacity=20;
    int item=6;
    int i;
    for(i=0;i<n;i++)
    {
      System.out.print(" "+ar[i]);
    }

    InsertDeleteSearch ids= new InsertDeleteSearch();

    n=ids.insertElement(ar,n,capacity,item);

    System.out.println(" after insert");
    System.out.println();
      for(i=0;i<n;i++)
        {
          System.out.print(" "+ar[i]);
        }

  n=ids.deleteElement(ar,n,2);
  System.out.println(" after insert");
  System.out.println();
      for(i=0;i<n;i++)
       {
         System.out.print(" "+ar[i]);
       }

   }

}
