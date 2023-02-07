import java.util.Arrays;
 public class merge { 
    public static void main(String[] args)
    {
        int a[]={6,8,9,9,13};
        int b[]={4,6,9,10};

        int m=a.length;
        int n=b.length;
        int res[]=new int[m+n];
        int i=m-1;
        int j=0;
        while(i>=0&&j<n)
        {
            if(a[i]>b[j])
            {
                int temp=a[i];
                 a[i]=b[j];
                 b[j]=temp;
                

            }
            i--;
            j++;
        }
            Arrays.sort(a);
            Arrays.sort(b);
            for( i=0;i<m;i++)
            {
   res[i]=a[i];
            }
            for(i=0;i<n;i++)
            {
                res[m+i]=b[i];
            }

        
        System.out.println("The merge two sorted and non decresing array is ");
        for(i=0;i<m+n;i++)
        {
System.out.println(res[i]);
        }
    }
    
}
