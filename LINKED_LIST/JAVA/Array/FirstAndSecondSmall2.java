import java.util.*;
import java.io.*;

class FirstAndSecondSmall2
{
  void smallUtil(int ar[],int n)
  {
    int first_min=ar[0];
    int i;

    for(i=1;i<n;i++)
    {
      if(ar[i]<first_min)
      {
        first_min=ar[i];

      }

    }
      int sec_min=99999;
        for(i=0;i<n;i++)
        {

          if(ar[i]>first_min && ar[i]<sec_min)
          {
            sec_min=ar[i];

          }

        }

    System.out.println(first_min+"  "+sec_min);

  }

  public static void main(String args[])
  {
    int ar[]={12,13,1,10,34,1};
    int n=ar.length;

    FirstAndSecondSmall2 fs=new FirstAndSecondSmall2();

    fs.smallUtil(ar,n);


  }

}
