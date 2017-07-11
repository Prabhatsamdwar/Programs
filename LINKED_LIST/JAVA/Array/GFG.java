import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    int oddOccurenceUtil(int ar[], int n)
    {
        int result=0;
        int i;
        for(i=0;i<n;i++)
          result=result^ar[i];

          return result;
    }

	public static void main (String[] args) {
	int j,i;

	GFG od=new GFG();
	Scanner sc= new Scanner(System.in);

	int size=sc.nextInt();
        int[] ar=new int[size];
        for(j=0;j<size;j++)
        {
            ar[j]=sc.nextInt();
        }
	    int b=od.oddOccurenceUtil(ar,size);
	    if(b==0)
	    {
	        System.out.println("No odd");
	    }
	    else
	    {
	        System.out.print(b);
	    }
}

}
