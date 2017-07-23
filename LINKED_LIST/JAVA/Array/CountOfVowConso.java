import java.io.*;
import java.util.*;
import java.lang.String;

class CountOfVowConso
{
    void countUtil(String str, int n)
    {
        int i,j;
        char ch;
        int count=0;

        HashSet<Character> hs= new HashSet<Character>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('u');
        hs.add('o');

        for(i=0;i<n;i++)
        {
            if(hs.contains(str.charAt(i)))
            {
                count++;
            }

        }

            System.out.println("Vowels ="+count);
            System.out.println("conso ="+(n-count));

    }
    public static void main(String args[])
    {
        String str=new String("hello");
        int n= str.length();
        CountOfVowConso vc=new CountOfVowConso();
        vc.countUtil(str,n);

    }

}