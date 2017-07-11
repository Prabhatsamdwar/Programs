import java.util.*;
import java.io.*;

class ChechConsecutive
{
    boolean checkUtil(int ar[], int n)
    {
        boolean flag=false;
        Arrays.sort(ar);
        int l=ar[0];
       // int k=ar[n-1];
        for(int i=0;i<n;i++)
        {
            if(ar[i]==l)
            {
                l++;
                flag=true;
            }
            else
            {
                flag=false;
                return flag;
            }
        }
        return flag;
    }

    public static void main(String args[])
    {
        int ar[]={5,2,6,4,1};
        int n=ar.length;
        ChechConsecutive cc=new ChechConsecutive();
        boolean b=cc.checkUtil(ar,n);
        if(b==true)
        System.out.println("Consecutive");
        else
            System.out.println("Non Consecutive");

    }


}