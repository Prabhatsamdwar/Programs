import java.util.*;
import java.io.*;
import java.lang.String;

class StringFirstOddOcc_LinkedHm
{
    void firstOddUtil(String str)
    {
        char[] char_ar=str.toCharArray();
        Map<Character,Integer> hm= new LinkedHashMap<Character,Integer>();

        for(Character ch :char_ar)
        {
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
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey()+" ");
                break;
            }
        }

    }

    public static void main(String args[])
    {
        StringFirstOddOcc_LinkedHm fo=new StringFirstOddOcc_LinkedHm();
        String str= new String("Morning");
        fo.firstOddUtil(str);

    }

}