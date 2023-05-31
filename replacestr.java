public class replacestr {

   public static int maxSum(int arr[],int n, int k)
   {
       int max=0;
       int firstpoint=0;
             int sum=0;
       for(int i=0;i<arr.length;i++)
       {
           
           sum+=arr[i];
           if(i>=k-1)
           {
               max=Math.max(max,sum);
               sum=sum-arr[firstpoint];
               firstpoint++;

           }

       }
       return max;
   }
    public static void main(String[]args)
    {

        int arr[] = {2, 1, 9, -1, 1, 5, 4};
        int k = 2;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
        
    }
    
}
