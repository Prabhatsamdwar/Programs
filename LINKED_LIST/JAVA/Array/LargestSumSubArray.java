import java.util.*;
import java.io.*;

class LargestSumSubArray
{

  int largestSumUtil(int ar[])
  {
    int max_so_far=0;
    int max_end_here=0;
    int i;

    for(i=0;i<ar.length;i++)
    {
      max_end_here=max_end_here+ar[i];
      if(max_end_here<0)
      {
        max_end_here=0;
      }

      if(max_so_far<max_end_here)
      {
        max_so_far=max_end_here;

      }
    }

    return max_so_far;

  }

  public static void main(String args[])
  {
    int ar[]={-2, -3, 4, -1, -2, 1, 5, -3};
    LargestSumSubArray ls=new LargestSumSubArray();
    int sum=ls.largestSumUtil(ar);
    System.out.println("  "+sum);
  }



}
