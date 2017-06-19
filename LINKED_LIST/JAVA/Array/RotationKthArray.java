import java.util.*;
import java.io.*;

class RotationKthArray
{
   public void rotationKthUtil(int ar[],int n,int a)
   {
     int i,j;
     int d=a;
     int[] temp=new int[d];
     for(i=0;i<d;i++)
     {
       temp[i]=ar[i];
     }

     for(i=d;i<n;i++)
     {
       ar[i-d]=ar[i];
     }

     j=n-1;
     for(i=d-1;i>=0;i--)
     {
       ar[j]=temp[i];
       j--;
     }


   }

   public static void main(String args[])
   {
     int i;
     int ar[]={1,2,3,4,5,6,7};
     RotationKthArray rt= new RotationKthArray();

   for(i=0;i<ar.length;i++)
   {
   System.out.print(" "+ar[i]);
   }
   System.out.println();

     rt.rotationKthUtil(ar,ar.length,3);

   for(i=0;i<ar.length;i++)
   {
   System.out.print(" "+ar[i]);
   }

  }



}
