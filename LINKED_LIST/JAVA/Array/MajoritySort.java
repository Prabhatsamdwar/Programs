import java.util.*;
import java.io.*;

public class MajoritySort
{
    boolean majorityUtil(int ar[],int n)
  {
      int count=0;
      int candidate;
      int i,j;
      for(i=0;i<n;i++)
      {
        candidate=ar[i];
        count=1;
        for(j=i+1;j<n;j++)
        {
          if(candidate==ar[j])
          {
              count++;
          }
          else {
            break;
          }
        }
      if(count==(n/2))
        return true;

      i=j-1;

      }

      return false;

  }



    public static void main(String args[])
    {
      int ar[]={1,2,2,3,3,4,4,5,6};
      int n=ar.length;
      MajoritySort ms= new MajoritySort();
      if(ms.majorityUtil(ar,ar.length)==true)
      System.out.print(" majority element exists");
      else
      System.out.print(" majority element doesnot exists");
    }

}
