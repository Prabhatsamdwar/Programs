import java.util.*;
import java.io.*;

class TrapingWater
{
  int trapingWaterUtil(int ar[],int n)
  {
      Arrays.sort(ar);
      int rightBar=ar[n-1];
      int leftBar=ar[n-2];
      int water=0,i;

            for(i=0;i<n;i++)
            {
              System.out.print(ar[i]+" ");
            }

      for( i=0;i<n-2;i++)
      {
        water=water+(leftBar-ar[i]);

      }

      return water;
  }

  public static void main(String args[])
  {
    int ar[]={3,0,0,2,0,4};
    int n=ar.length;
    TrapingWater tp= new TrapingWater();
    int temp=tp.trapingWaterUtil(ar,n);
    System.out.println("traped water= "+temp);

  }


}
