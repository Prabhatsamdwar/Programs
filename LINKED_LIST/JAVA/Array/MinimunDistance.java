import java.io.*;
import java.util.*;

class MinimumDistance
{

    int minimumDistanceUtil(int ar[],int n,int a,int b) {
        int i, j,mindist=999;
        for (i = 0; i < n; i++) {
            if (ar[i] == a || ar[i] == b) {
                if (ar[i] == a) {
                    for (j = i + 1; j < n; j++) {
                        if (ar[j] == b) {
                            mindist =j-i;
                            break;
                        }
                    }

                }

                if (ar[i] == b) {
                    for (j = i + 1; j < n; j++) {
                        if (ar[j] == a) {
                            mindist = j - i;
                            break;

                        }

                    }


                }

            }

        }
        return mindist;
    }
    public static void main(String args[])
    {
        int ar[]={2, 5, 3, 5, 4, 4, 2, 3};
        int n=ar.length;
        MinimumDistance md= new MinimumDistance();
        int b= md.minimumDistanceUtil(ar,n,3,2);
        System.out.println("minimum distace : "+b);
    }

}