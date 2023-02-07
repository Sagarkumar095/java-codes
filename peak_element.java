public class peak_element {

    public static int peakele (int a[],int n)
    {
        int l=0;
        int h=n-1;
        int mid=(l+h)/2;
        while(l<=h)
        {
        if((mid==0|| a[mid]>=a[mid-1])&&(mid==n-1||mid>=a[mid+1]))
        {
            return mid;
            
        }
        
        else if(mid<=a[mid+1])
        {
            l=mid+1;
        }
        else
        {
            h=mid-1;
        }
    
    }
return mid;
    }
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int n=3;
        int ans=peakele(a,n);
        System.out.println(ans);
    }

    
}
