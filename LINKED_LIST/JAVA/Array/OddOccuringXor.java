import java.util.*;
import java.io.*;

class OddOccuringXor
{
  int oddOccuringUtil(int ar[])
  {
    int i;
    int result=0;
    for(i=0;i<ar.length;i++)
    {
      result=result^ar[i];
    }
    return result;

   }

  public static void main(String args[])
  {
    int ar[]={1, 2, 2, 2, 3, 1, 3};

    OddOccuringXor od=new OddOccuringXor();
    int m=od.oddOccuringUtil(ar);

    if(m==0)
    System.out.println("does not exist");
    else {
      System.out.println("  "+m);
    }
  }



}
