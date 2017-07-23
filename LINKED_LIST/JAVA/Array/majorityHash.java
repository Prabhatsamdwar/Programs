import java.util.*;
import java.io.*;

class majorityHash
{
        public int majorityElement(int[] A)
        {

            Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int n=A.length;
        int result=0;

        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(A[i]))
                hm.put(A[i],1);

            else
                hm.put((A[i]),hm.get(A[i])+1);


        }

            System.out.println(hm);
        for(Map.Entry<Integer,Integer> entry :hm.entrySet())
        {
        if(entry.getValue()>n/2)
        {
            result= entry.getKey();

        }

        }
        return result;
        }

    public static void main(String args[])
    {
        int ar[]={2,1,2};
        int n=ar.length;

        majorityHash mj=new majorityHash();
        int b=mj.majorityElement(ar);
        System.out.println(" ME= "+b);

    }

}
