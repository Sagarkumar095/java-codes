public class subarray {
    public static void main(String[]args)
    {
        int a[]={1,3,4,5,6,7,8,10};
        int n=a.length;
        int s=8;
        int sum=0;
        for(int i=0;i<n;i++)      // o(n^2)...
        {
             sum=a[i];
            for(int j=i+1;j<n;j++)
            {
             sum+=a[j];
             if(sum==s)
             {
                 System.out.println(i+" "+j);
             }   
            }
        }
    }
    
}
