import java.util.*;
import java.io.*;

class FirstAndSecondSmall
{
  void smallUtil(int ar[],int n)
  {

    Arrays.sort(ar);
    int first_min=ar[0];
    int sec_min=0;
    int i;

    for(i=1;i<n;i++)
    {
      if(ar[i]>first_min)
      {
        sec_min=ar[i];
        break;
      }

    }

    System.out.println(first_min+"  "+sec_min);

  }

  public static void main(String args[])
  {
    int ar[]={12,13,1,10,34,1};
    int n=ar.length;

    FirstAndSecondSmall fs=new FirstAndSecondSmall();

    fs.smallUtil(ar,n);


  }

}
