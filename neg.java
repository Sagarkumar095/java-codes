public class neg {

    public static void main(String[] args)
    {
        int arr[]={5,1,2,0,-5,-1,-3};
     
        // move all negative at first

        int l=0;
        int h=arr.length-1;
        while(l<=h)
        {
            if(arr[l]>0)
            {
                int temp=arr[l];
                arr[l]=arr[h];
                arr[h]=temp;
                l++;
                h--;
            }
            else
            l++;
        }
        // print 
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    
}
