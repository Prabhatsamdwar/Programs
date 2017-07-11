import java.util.*;
import java.io.*;

class MajorityElement
{
   int findCandidate(int ar[], int n)
   {
        int maj_index=0;
        int i,count=1;
        for(i=1;i<n-1;i++)
        {
          if(ar[maj_index]==ar[i])
          count++;
          else
          count--;

          if(count==0)
          {
            maj_index=i;
            count=1;
          }


        }
        return ar[maj_index];
   }


    boolean isMajorityUtil(int ar[],int n,int candidate)
    {
        int i,count=0;
        for(i=0;i<n;i++)
        {
          if(candidate==ar[i])
          count++;

        }
        if(count>n/2)
        return true;
        else
        return false;
    }
    void printMajority(int ar[], int n)
    {
          int candi=findCandidate(ar,n);

          if(isMajorityUtil(ar,n,candi))
          System.out.println("MajorityElement is "+candi);
          else
          System.out.println("not found");
    }

    public static void main(String args[])
    {
      int ar[]={2,2,3,3,4,4,4,3,4,4,4};
      int n=ar.length;

      MajorityElement mj=new MajorityElement();
      mj.printMajority(ar,n);

    }

}
