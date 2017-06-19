import java.util.*;
import java.io.*;

class RotationKthArray2
{
   public void rotationKthUtil(int ar[],int n,int d)
   {
      int temp=0;
      int i;
      int j;

     for(i=0;i<d;i++)
     {
       temp=ar[0];
       for(j=1;j<n;j++)
       {
         ar[j-1]=ar[j];

       }
       ar[n-1]=temp;
     }

   }

   public static void main(String args[])
   {
     int i;
     int ar[]={1,2,3,4,5,6,7};
     RotationKthArray2 rt= new RotationKthArray2();

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
