public class subarray2 {
    public static void main(String[] args)
    {
        int a[]={-1,-2,-3,-4};
        int sum=Integer.MIN_VALUE;
       
        for(int i=0;i<a.length-1;i++)
        {
            int curr_sum=a[i];
            for(int j=i+1;j<a.length;j++)
            {
                
                if(curr_sum>sum)
                {
                    sum=curr_sum;
                }
                else
                curr_sum+=a[j]; 
                
            }
        }
        System.out.println(sum);
    }
    
}
