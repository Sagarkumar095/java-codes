import java .util.*;
public class quicksort {
    public static void main(String[] args)
    {
       
    int a[]={4,2,8,3,1,5,7,11,6};
    int size=a.length;
    System.out.println("Before sorting");
    printarray(a,size);
    quicksorted(a,0,size-1);
    System.out.println("after sorting");
    printarray(a,size);


    
    }

    private static void quicksorted(int[] a, int i, int j) {
      if(i<j)
      {
          int pi=partition(a,i,j);
          quicksorted(a, i, pi-1);
          quicksorted(a, pi+1, j);
      }
    }

    public static int partition(int[] a, int i, int j) {
        int l=i;
        int r=j;
        int pivot=a[l];
        while(l<r)
        {
            while(pivot>=a[l])
            {
                l++;
            }
            while(pivot<a[r])
            {
                r--;
            }
            if(l<r)

            {
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
            }
        }
       int temp=a[i];
       a[i]=a[r];
       a[r]=temp;
        return r;
    }


    private static void printarray(int[] a, int size) // print the array
     {
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
    
        }
    }
}
    