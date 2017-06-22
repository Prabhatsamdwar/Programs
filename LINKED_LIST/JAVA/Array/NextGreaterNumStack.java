import java.util.*;
import java.io.*;

public class NextGreaterNumStack
{
    void nextGreaterUtil(int ar[],int n)
    {
      int top_num=0;
      Stack<Integer> stack= new Stack<>();

      stack.push(ar[0]);

      for(int i=1;i<n;i++)
      {

          while(!stack.empty() && stack.peek()<ar[i])
            {
              System.out.println(stack.pop()+" greater no is "+ar[i]);

            }
            stack.push(ar[i]);

      }

      while(!stack.empty())
      {
        int temp=stack.pop();
        System.out.println(temp +" greater no is "+null);
      }
 }

    public static void main(String args[])
    {
      int ar[]={98,23,54,12,20,7,27};
      int n=ar.length;
      NextGreaterNumStack ng= new NextGreaterNumStack();
      ng.nextGreaterUtil(ar,n);

    }

}
