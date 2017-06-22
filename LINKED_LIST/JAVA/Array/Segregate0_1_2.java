import java.util.*;
import java.io.*;

class Segregate0_1_2
{
    void segregateUtil(int ar[], int n)
    {
        int l=0;
        int r=n-1;
        int temp=0;
        while(l<r)
        {
          while(ar[l]==0 && l<r)
          {
            l++;
          }
          while(ar[r]==1 && l<r)
          {
            r--;
          }
          if(l<r)
          {
            temp=ar[l];
            ar[l]=ar[r];
            ar[r]=temp;
            l++;
            r--;
          }

        }

    }

    public static void main(String args[])
    {
      int ar[]={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
      int n=ar.length;
      Segregate0_1_2 seg=new Segregate0_1_2();
      seg.segregateUtil(ar,n);
      for(int i=0;i<n;i++)
      {
        System.out.print(ar[i]+" ");
      }

    }

}
