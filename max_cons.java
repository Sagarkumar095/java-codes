public class max_cons {
    public static void main(String[] args)
    {
        int arr[]={1,1,0,0,1,1,1,1,1};
        // ones flip with 0 allowed and cont max consecutive sum of 1;
        int start=0;
        int maxcon=0;
        int k=1;// only one flip allowed
        int zerocount=0;
        for(int end=0;end<arr.length;end++)
        {
            if(arr[end]==0)
            {
                zerocount++;
            }
            while(zerocount>k)

            {
                if(arr[start]==0)
                {
                    zerocount--;
                }
                start++;
            }
               maxcon=Math.max(maxcon,end-start+1);
        }
        System.out.println(maxcon );

    }
    
}
