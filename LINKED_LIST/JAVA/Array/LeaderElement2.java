import java.util.*;
import java.io.*;

class LeaderElement2
{
   void leaderUtil(int ar[], int n)
   {
     int j;
     int i;
     int max_element=ar[n-1];
     System.out.print(max_element+" ");
     for(j=n-2;j>=0;j--)
     {
       if(max_element<ar[j])
       {
         max_element=ar[j];
         System.out.print(max_element+" ");
       }

     }


    }

public static void main(String args[])
{
  int ar[]={16, 17, 4, 3, 5, 2};

  LeaderElement2 ld= new LeaderElement2();
  ld.leaderUtil(ar,ar.length);

}

}
