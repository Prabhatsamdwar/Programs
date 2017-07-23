import java.io.*;
import java.util.*;

class MissingAndRepeating
{
        void missingRepeatingUtil(int ar[],int n)
        {
            int i,j;
            int mini=999;
            int maxi=-999;
            Map<Integer,Integer> map=new HashMap<Integer,Integer>();

            for(i=0;i<n;i++)
            {
                if(!map.containsKey(ar[i]))
                        map.put(ar[i],1);
                else
                    map.put(ar[i],map.get(ar[i])+1);

            }

            for(Map.Entry<Integer,Integer> entry:map.entrySet())
            {
                if (entry.getValue() > 1) {
                    System.out.println("Repeating no : "+entry.getKey());
                    break;
                }
            }
            for(i=0;i<n;i++)
            {
                if(ar[i]>maxi)
                    maxi=ar[i];
                if(ar[i]<mini)
                    mini=ar[i];
            }

            for(i=mini;i<=maxi;i++)
            {
                if(!map.containsKey(i))
                 {
                    System.out.println("Missing No :" + i);
                 }
                }
            }

    public static void main(String args[])
    {
        int ar[]={4, 3, 6, 2, 1, 1};
        int n=ar.length;
        MissingAndRepeating mr= new MissingAndRepeating();
        mr.missingRepeatingUtil(ar,n);

    }

}