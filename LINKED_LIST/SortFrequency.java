import java.util.*;
import java.io.*;

class SortFrequency {
    void frequencyUtil(int ar[], int n) {
        int[] count = new int[n];
        int[] data = new int[n];

        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (Integer i : ar) {
            if (!hm.containsKey(i)) {
                hm.put(i, 1);
            } else {
                hm.put(i, hm.get(i) + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = hm.entrySet();
        int i = 0;
        int size = 1;
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            data[i] = entry.getKey();
            count[i] = entry.getValue();
            i++;
            size++;
        }

       /* System.out.println();
        for (i = 0; i < size - 1; i++) {
            System.out.print(data[i] +" ");
        }
        System.out.println();
        for (i = 0; i < size - 1; i++) {
            System.out.print(count[i] +" ");
        }*/

            int temp=0,j;
        for(i=0;i<size-1-1;i++)
        {
            for(j=i+1;j<size-1;j++)
            {
                if(count[i]<count[j])
                {
                    temp=count[i];
                    count[i]=count[j];
                    count[j]=temp;

                    temp=data[i];
                    data[i]=data[j];
                    data[j]=temp;

                }

            }
        }

        /*System.out.println();
        for (i = 0; i < size - 1; i++) {
            System.out.print(data[i] +" ");
        }
        System.out.println();
        for (i = 0; i < size - 1; i++) {
            System.out.print(count[i] +" ");
        }*/

        System.out.println();

        for(i=0;i<size-1;i++)
        {
            while(count[i]>0)
            {
                System.out.print(data[i]+" ");
                count[i]--;
            }
        }


    }

    public static void main(String args[])
    {
        int ar[]={2,5,5,2,8,8,5,5,6,6,6,8,8,8};
        int n=ar.length;
        SortFrequency sf=new SortFrequency();
        sf.frequencyUtil(ar,n);
    }
}
