import java.util.*;
import java.io.*;

public class MajoritySort2
{
    boolean majorityUtil(int ar[],int n)
  {
      int count=0;
      int l=0;
      int r=n-1;
      int x=0;

      while(l<r)
      {
        if(ar[r]>0 && x==0)
        {
          count=1;
          x=r-1;
        }
        if(x<0)
        {
          return false;
        }

        if(ar[x]==ar[r])
        {
          count++;
          x--;
        }
        else
        {
          r=x;
          x=0;
        }

    if(count==(n/2))
    return true;

    }

return false;

  }



    public static void main(String args[])
    {
      int ar[]={1,2,2,3,3,4};
      int n=ar.length;
      MajoritySort2 ms= new MajoritySort2();
      if(ms.majorityUtil(ar,ar.length)==true)
      System.out.print(" majority element found");
      else
      System.out.print(" majority ele not found");
    }

}
