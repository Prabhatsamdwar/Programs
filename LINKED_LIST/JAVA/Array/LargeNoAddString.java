import java.io.*;
import java.util.*;
import java.lang.*;

class LargeNoAddString
{        static Integer carry=0;
        public void addUtil(String a, String b)
        {
            ArrayList<String> res=new ArrayList<String>();
            int i=a.length()-1;
            int j=b.length()-1;

            while(true)
            {
                int i1=Integer.parseInt(Character.toString(a.charAt(i)));
                int i2=Integer.parseInt(Character.toString(b.charAt(j)));
                Integer i3=i1+i2+carry;
                if(i3>9)
                {
                    carry=1;
                    i3=i3-10;

                }else
                {
                    carry=0;
                }
                res.add(i3.toString());
                i--;
                j--;
                if(i<0)
                {
                    res.add(carry.toString());
                    break;

                }

            }
            Collections.reverse(res);

            for(String ch:res)
                System.out.print(ch);

        }

        public static  void main(String args[])
        {
            String s1 = "7654729850328997631007285998163550104";
            String s2 = "5980139243970186632651869926335829102";
            LargeNoAddString la=new LargeNoAddString();
            la.addUtil(s1,s2);

        }

}
