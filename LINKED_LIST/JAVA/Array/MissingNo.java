import java.util.*;
import java.io.*;

class MissingNo
{
    int missingNoUtil(int ar[])
    {
      int i;
      int n=ar[ar.length-1];
      int sum=(n*(n+1))/2;
     for(i=0;i<ar.length;i++)
     {
       sum=sum-ar[i];
     }

     return sum;

    }

public static void main(String args[])
{
  int ar[]={1,2,3,4,5,6,7,9};
  MissingNo msn=new MissingNo();

  int n=msn.missingNoUtil(ar);
  System.out.println("missing No is "+n);

}


}
