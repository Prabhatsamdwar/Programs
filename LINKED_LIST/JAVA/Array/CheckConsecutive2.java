import java.util.*;
import java.io.*;

class ChechConsecutive
{

    int getMin(int ar[],int n)
    {
        int min=999999;
        for(int i=0;i<n;i++)
        {
            if(ar[i]<min)
            {
                min=ar[i];
            }
        }
    return min;
    }

    int getMax(int ar[], int n)
    {
        int max=-999;
        for(int j=0;j<n;j++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
            }

        }
        return max;
    }

    boolean checkUtil(int ar[], int n) {
        int max = getMax(ar, n);
        int min = getMin(ar, n);

        if ((max - min + 1 )==n)
        {
            boolean[] visited = new boolean[n];

            for (int i = 0; i < n; i++) {
                if (visited[ar[i] - min] != false)
                    return false;

                visited[ar[i] - min] = true;

            }

            return true;
        }
        return false;
    }

    public static void main(String args[])
    {
        int ar[]={5,2,3,4,1};
        int n=ar.length;
        ChechConsecutive cc=new ChechConsecutive();
        boolean b=cc.checkUtil(ar,n);
        if(b==true)
            System.out.println("Consecutive");
        else
            System.out.println("Non Consecutive");

    }


}