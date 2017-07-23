import java.util.*;
import java.io.*;

class MaxIndexDiff
{
    int maxDiffUtil(int ar[], int n)
    {
        int l=0;
        int r=n-1;
        int max=0;
        while(r>l)
        {
            if(ar[r]>ar[l])
            {
                if(max<r-l)
                {
                    max=r-l;
                }
                r=n-1;
                l++;
            }
            else
            {
                r--;
            }
        }

        return max;
    }

    public static void main(String args[])
    {
        int ar[]={9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        int n=ar.length;
        MaxIndexDiff md=new MaxIndexDiff();
        int b=md.maxDiffUtil(ar,n);
        System.out.println(b+" ");
    }
}