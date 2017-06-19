import java.util.*;
import java.io.*;

class ReverseArray
{
   void reverseUtil(int ar[],int n)
   {
     int l=0;
     int r=n-1;
     int temp=0;
     while(l<r)
     {
       temp=ar[l];
       ar[l]=ar[r];
       ar[r]=temp;
       l++;
       r--;
     }


   }

public static void main(String args[])
{
  int i;
  int ar[]={1,2,3,4,5,6,7};
  ReverseArray rv= new ReverseArray();

for(i=0;i<ar.length;i++)
{
System.out.print(" "+ar[i]);
}
System.out.println();
  rv.reverseUtil(ar,ar.length);

for(i=0;i<ar.length;i++)
{
System.out.print(" "+ar[i]);
}

}



}
