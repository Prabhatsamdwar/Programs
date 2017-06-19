import java.util.*;
import java.io.*;

class LeaderElement
{
   void leaderUtil(int ar[], int n)
   {
     int i,j;

     for(i=0;i<n;i++)
     {

       for(j=i+1;j<n;j++)
       {
        if(ar[i]<=ar[j])
        break;
      }
       if(j==n)
       System.out.print(ar[i]+" ");

    }

    }

public static void main(String args[])
{
  int ar[]={16, 17, 4, 3, 5, 2};

  LeaderElement ld= new LeaderElement();
  ld.leaderUtil(ar,ar.length);

}

}
