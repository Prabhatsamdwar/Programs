import java.util.*;
import java.io.*;

class CollectionHashSet
{
   public static void main(String args[])
   {
     HashSet<Integer> hs=new HashSet<>();
     hs.add(4);
     hs.add(5);
     hs.add(3);
     hs.add(15);
     hs.add(7);

      System.out.println("element of HashSet : "+hs);
      Iterator it=hs.iterator();

      if(hs.contains(4))
      System.out.println("True");
      else
      System.out.println("false");

      while(it.hasNext())
      {
        System.out.println(it.next()+" ");
      }

   }


}
