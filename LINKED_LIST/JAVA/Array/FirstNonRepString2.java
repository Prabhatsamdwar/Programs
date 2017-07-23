import java.io.*;
import java.util.*;
import java.lang.String;

class FirstNonRepString2
{
    void firstNonRepUtil(String str,int n)
    {
        Map<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
        char ch;
        int i;
        for(i=0;i<n;i++)
        {
            ch=str.charAt(i);
            if(!hm.containsKey(ch))
            {
                hm.put(ch,1);
            }
            else
            {
                hm.put(ch,hm.get(ch)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey());
                break;
            }

        }

    }

    public static void main(String args[])
    {
        String str=new String("hello");
        int n= str.length();
        FirstNonRepString2 fs=new FirstNonRepString2();
        fs.firstNonRepUtil(str,n);

    }

}