public class pattern01 {
    public static void sort(int arr[],int n)
    {
       // int n=arr.length;
        int l=0;
        int   h=n-1;
        int m=0;
        while(l<=h)
        {
            if(arr[l]==1)
            {
               l++;
            }
           else  if(arr[l]==0)
            {
                swap(arr,m,l);
                m++;
                l++;
            }
            else
            {
                swap(arr,l,h);
                h--;
            }
        }
    }
    // swap method
    public static void swap(int arr[],int l,int h)
    {
        int temp=arr[l];
         arr[l]=arr[h];
         arr[h]=temp;

    }
    public static void main(String[] ags)
    {
       int arr[]={1,1,0,2,1,0,0,2,2,1,0};

          int n=arr.length;

       // sort according to 0,1 and 2.

       sort(arr,n);
       // print the sorted array
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+ " ");
       }
    }
    
}
