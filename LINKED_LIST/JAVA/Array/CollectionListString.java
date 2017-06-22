import java.util.*;
import java.io.*;

class CollectionListString
{
    public static void main(String args[])
    {
      List<String> ls=new ArrayList<>();

      ls.add("ram");
      ls.add("tung");
      ls.add("amit");
      ls.add("pooja");
      ls.add("Rosh");
      ls.add("jyo");

      System.out.println("LinkedList element:"+ls);


      ListIterator<String> li=ls.listIterator();

      if(!(ls.contains("pooa")))
      System.out.println("false");

      while(li.hasNext())
      {
        System.out.print(li.next()+" ");
      }


    }


}
