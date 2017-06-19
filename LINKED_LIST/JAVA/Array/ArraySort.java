import java.util.*;
import java.io.*;

class ArraySort
{
  public static void main(String args[])
  {
     int ar[]={-8,2,-15,4,1,17,3};
     int i;
     int k=16;

     for(i=0;i<ar.length;i++)
     {
       System.out.print("  "+ar[i]);
     }

  Arrays.sort(ar);
  int l=0;
  int r=ar.length-1;
  int flag=0;

   while(l<r)
   {
     if(ar[l]+ar[r]==k)
     {
       flag=1;
       break;
     }
        if(ar[l]+ar[r]<k)
      {
        l++;
        }else {
          r--;
            }

    }

      if(flag==1)
    {
      System.out.println("pair exists");

    }
    else if(flag==0)
    {
      System.out.println("pair does not exist");
    }


}

}
