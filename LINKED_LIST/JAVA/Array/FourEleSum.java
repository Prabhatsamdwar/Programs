import java.util.*;
import java.io.*;


class FourEleSum
{
    boolean eleSumUtil(int ar[],int n)
    {
      int l;
      int r;
      int a=0;
      int b=0;
      int c=0;
      int d=0;
      int flag=0;
      Arrays.sort(ar);

      for(int i=0;i<n;i++)
      {
        System.out.print(ar[i]+" ");
      }

      for(l=0,r=n-1;l<n-1 && r>0;l++,r--)
      {
        if((ar[l+1]-ar[l])==(ar[r]-ar[r-1]))
        {
          if((ar[l]+ar[r])==(ar[r-1]+ar[l+1]))
          {
            a=ar[l];
            b=ar[r];
            c=ar[r-1];
            d=ar[l+1];

            flag=1;
            break;
          }
        }
      }
      if(flag==1)
      {
        System.out.println("\n"+a+" "+" "+b+" "+c+" "+d);
        return true;
      }

      return false;
    }

    public static void main(String args[])
    {
      int ar[]={65, 30, 7, 90, 1, 9, 8};
      int n=ar.length;
      FourEleSum fs=new FourEleSum();
      boolean b=fs.eleSumUtil(ar,n);
      if(b==true)
      System.out.println("true");
      else {
        System.out.println("false");
      }

    }



}
