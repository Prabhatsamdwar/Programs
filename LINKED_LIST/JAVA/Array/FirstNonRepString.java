import java.io.*;
import java.util.*;
import java.lang.String;

class FirstNonRepString
{
    void firstNonRepUtil(String str,int n)
    {
        int ch;
        int i,j;
        int count;
        for(i=0;i<n;i++)
        {
            count=1;
            ch=str.charAt(i);
            for(j=i+1;j<n;j++)
            {
                if(str.charAt(j)==ch)
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(" "+str.charAt(i));
                break;
            }

        }

    }
    public static void main(String args[])
    {
        String str=new String("hello");
        int n= str.length();
        FirstNonRepString fs=new FirstNonRepString();
        fs.firstNonRepUtil(str,n);

    }

}