import java.util.Arrays;

public class majority {
    
    public static void main(String[]args)
    {
       int n=5;
       int a[]={1,2,1,6,5};
       int maj=findmajority(a,n);
       System.out.println("The majority element is ="+maj);  
    }

    private static int findmajority(int[] a, int n) {
        Arrays.sort(a);
        int max=1;
        for(int i=0;i<n-1;i++)
        {
           // max=1;
             if(a[i]==a[i+1])
             {
                 max++;
             }
        }
        if(max>n/2)
        {
        return max;
        }
     return 0;
    }
   // return 0;
}
