int partition(int *A,int start,int end)
{
    int i;
int pivot=A[end];
int partitionIndex=start;

for(i=start;i<end;i++)
 {
  if(A[i]<=pivot)
  {
          int temp=A[i];
          A[i]=A[partitionIndex];
          A[partitionIndex]=temp;

      partitionIndex++;
  }

}
         int temp=A[end];
          A[end]=A[partitionIndex];
          A[partitionIndex]=temp;

   return partitionIndex;

}
void quickSort(int *A,int start,int end)
{

   if(start<end)
   {
    int pIndex=partition(A,start,end);
    quickSort(A,start,pIndex-1);
    quickSort(A,pIndex+1,end);

   }

}
