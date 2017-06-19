import java.util.*;
import java.io.*;

class OddOccuring
{
  int oddOccuringUtil(int ar[])
  {
    int n=ar.length;
    int count=0;
    int candidate=0;
    int i;
    for( i=0;i<n;i++)
    {
      if(count==0)
      {
      candidate=ar[i];
      count=1;
      }
      else
        {
          if(candidate==ar[i])
          count++;
          else
          count--;
        }
    }

    if(count==0)
    return 0;

    else {
      count=0;
      for(i=0;i<n;i++)
      {
        if(candidate==ar[i])
        {
          count++;
        }
      }

   return (count%2!=0?candidate:0);
 }

}


  public static void main(String args[])
  {
    int ar[]={1, 2, 3, 2, 3, 1, 3};

    OddOccuring od=new OddOccuring();
    int m=od.oddOccuringUtil(ar);

    if(m==0)
    System.out.println("does not exist");
    else {
      System.out.println("  "+m);
    }
  }



}
