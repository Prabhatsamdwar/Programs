import java.util.*;
import java.io.*;

class PairOfSum
{
    int pairSumUtil(int ar[],int k)
    {
      int i,j;
      int result=0;
      int flag=0;
      int n=ar.length;

      for(i=0;i<n;i++)
      {
        result=k-ar[i];
        for(j=0;j<n;j++)
        {
          if(result==ar[j])
          {
            flag=1;
            break;
          }
        }

      }
return flag;

   }

public static void main(String args[])
{
  int ar[]={1,4,45,6,10,-8};
  PairOfSum ps= new PairOfSum();
  int n= ps.pairSumUtil(ar,88);
 if(n==1)
 {
   System.out.println("pair exists");

 }
 else if(n==0)
  {
   System.out.println("pair does not exist");
  }


 }


}
