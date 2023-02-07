public class binarysearch {
    static int binary(int a[],int l,int h,int k)       // Binary  Search
    {
       
      
        while(l<h)
        {
            int  mid=(l+h)/2;
             if(a[mid]==k)
             {
                 return mid;
             }
             else if(a[mid]>k)
             {
                 h=mid-1;
             }
             else
             l=mid+1;

        }
        return -1;
    }
    public static void main(String[] args)
    {
        int a[]={3,5,7,8,10,45,50,100};
        int n=a.length;
       
        int k=50;
        int ans=binary(a,0,n-1,k);  //function call
        // print result
        System.out.println("the Search element is present at INdex  "+ans);

    }
}
