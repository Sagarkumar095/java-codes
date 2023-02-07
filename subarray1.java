public class subarray1 {
    
    public static void main(String[] args)
    {
        
        int a[]={1,3,4,5,6,7,8,10};
        int n=a.length;
        int s=8;
        int sum=0;
        for(int i=0;i<n;i++)  
        {
            int l=0;
            int r=0;
            sum+=a[i];
            if(sum==s)
            {
                System.out.println(l+" "+r);
            }
            if(sum>s)
            {
                sum-=a[l];
                l--;
            }
            if(sum<s)
            {
                sum+=a[r];
                r++;
            }
            
        }
    }
}
