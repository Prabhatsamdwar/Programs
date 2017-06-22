import java.util.*;
import java.io.*;

class CollectionList
{
    public static void main(String args[])
    {
      List<Integer> ls=new ArrayList<Integer>();

      ls.add(2);
      ls.add(8);
      ls.add(3);
      ls.add(6);
      ls.add(9);
      ls.add(1);

      System.out.println("ArrayList  element:"+ls);
      int[] ar=new int[ls.size()];

      ListIterator<Integer> li=ls.listIterator();
      int i=0;

      while(li.hasNext())
      {
        ar[i]=li.next();
        i++;
      }

      Arrays.sort(ar);
      for(i=0;i<ar.length;i++)
      {
        System.out.print(+ar[i]+"  ");
      }
    }







}
