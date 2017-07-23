import java.util.*;
import java.io.*;
import java.lang.String;

class StringFirstOddOcc
{
    void firstOddUtil(String str)
    {
        char[] char_ar=str.toCharArray();
        Map<Character,Integer> hm= new HashMap<Character,Integer>();

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
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(hm.get(c)==1)
            {
            System.out.println(c+" ");
            break;
            }


        }



    }

    public static void main(String args[])
    {
        StringFirstOddOcc fo=new StringFirstOddOcc();
        String str= new String("oorning");
        fo.firstOddUtil(str);

    }

}