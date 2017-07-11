import java.util.*;
import java.io.*;

class MaxTwoEle_Heap
{
  void findMaxUtil(int ar[],int n)
  {
    PriorityQueue<Integer> pqueue=new PriorityQueue<Integer>(10,Collections.reverseOrder());

    /*PriorityQueue<Integer> pq = new PriorityQueue<Integer>(defaultSize, new Comparator<Integer>() {
    int compare(Integer lhs, Integer rhs) {
        if (lhs > rhs) return +1;
        if (lhs.equals(rhs)) return 0;
        return -1;
    }
});
    */

   for(int i=0;i<n;i++)
   {
        pqueue.add(ar[i]);
   }
/*   System.out.println("Two max element of Arrays");
   for(int j=0;j<2;j++)
   {
     System.out.print(pqueue.poll()+"  ");
   }
*/

   int[] temp=new int[n];
   int l;
   for(l=0;l<n;l++)
   {
     temp[l]=pqueue.poll();
   }
   /*for(l=0;l<n;l++)
     System.out.print(temp[l]+" ");*/

     System.out.println("find kth max k=4 is "+temp[3]);




  }

  public static void main(String args[])
  {
    int ar[]={12,13,4,11,9,7,8};
    int n=ar.length;
    int i;
    for(i=0;i<n;i++)
      System.out.print(ar[i]+" ");

    MaxTwoEle_Heap mxe=new MaxTwoEle_Heap();
    mxe.findMaxUtil(ar,n);

  }


}
