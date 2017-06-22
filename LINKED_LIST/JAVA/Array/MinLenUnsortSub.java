import java.util.*;
import java.io.*;

class MinLenUnsortSub
{
  void MinLenUtil(int ar[],int n)
  {
    int[] temp= new int[n];
    int i,j;
    int startIndex=0;
    int endIndex=0;
  for(i=0;i<n;i++)
  {
    if(ar[i]>ar[i+1])
    {
      startIndex=i;
      break;
    }
  }

for(i=n-1;i>=0;i--)
  {
    if(ar[i]<ar[i-1])
      {
        endIndex=i;
        break;
      }
  }

int min=ar[startIndex];
int max=ar[startIndex];

for(i=startIndex;i<=endIndex;i++)
{
  if(ar[i+1]>max)
    max=ar[i+1];

  if(ar[i+1]<min)

  min=ar[i+1];
}
for(i=0;i<startIndex;i++)
{
  if(ar[i]>min)
  {
    startIndex=i;
    break;
  }
}
for(i=n-1;i>=endIndex;i--)
{
  if(ar[i]<max)
  {
    endIndex=i;
    break;
  }
}

System.out.println(" starting point "+startIndex+" to "+endIndex);


 }

  public static void main(String args[])
  {
    int ar[]={10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
    int n=ar.length;
    MinLenUnsortSub ml= new MinLenUnsortSub();
    ml.MinLenUtil(ar,n);

  }


}
