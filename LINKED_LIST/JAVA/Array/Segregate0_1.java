import java.util.*;
import java.io.*;

class Segregate0_1
{
    void segregateUtil(int ar[], int n)
    {
      Arrays.sort(ar);

    }

    public static void main(String args[])
    {
      int ar[]={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
      int n=ar.length;
      Segregate0_1 seg=new Segregate0_1();
      seg.segregateUtil(ar,n);
      for(int i=0;i<n;i++)
      {
        System.out.print(ar[i]+" ");
      }

    }

}
