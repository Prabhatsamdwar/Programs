import java.util.*;
import java.io.*;

public class MajoritySort2_On
{
    boolean majorityUtil(int ar[],int n,int x)
  {
    int last_index=0;
    last_index=(n%2==0)?(n/2):(n/2+1);
    int i;
    for(i=0;i<last_index;i++)
    {
      if(ar[i]==x && ar[i+n/2]==x)
        return true;

    }
return false;

  }



    public static void main(String args[])
    {
      int ar[]={1,2,2,3,4,4,4,4,4,5,6};
      int n=ar.length;
      MajoritySort2_On ms= new MajoritySort2_On();

      if(ms.majorityUtil(ar,ar.length,4)==true)
      System.out.print(" majority element exists");
      else
      System.out.print(" majority element doesnot exists");
    }

}
