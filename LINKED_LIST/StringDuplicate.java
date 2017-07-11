import java.io.*;
import java.util.*;
import java.lang.*;

class StringDuplicate
{
    void duplicateUtil(String str)
    {
        char[] characters=str.toCharArray();
        Map<Character,Integer> hmap= new HashMap<Character, Integer>();
        for(Character ch:characters)
        {
            if(hmap.containsKey(ch))
            {
                hmap.put(ch, hmap.get(ch)+1);
            }
            else
            {
                hmap.put(ch,1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet=hmap.entrySet();
        for(Map.Entry<Character,Integer> entry:entrySet)
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+" "+entry.getValue());

            }

        }

        int max=0;
        char ch1=' ';
        for(Map.Entry<Character,Integer> entry2:entrySet)
        {
            if(entry2.getValue()%2!=0)
            {
                System.out.println(entry2.getKey()+" No of odd occurence ="+entry2.getValue());
            }

            if(entry2.getValue()>max)
            {
                max=entry2.getValue();
                ch1=entry2.getKey();
            }


        }
            System.out.println(ch1+" Maximum occurence "+max);


    }

    public static  void main(String args[])
    {
        StringDuplicate sd=new StringDuplicate();
        String str="geeeksforgeeks";
        sd.duplicateUtil(str);

    }




}