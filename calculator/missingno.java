package calculator;

public class missingno {


    public static int getmissingNo(int[] arr,int n)
    {

       int Totalsum=(n*(n+1))/2;
      int sum=0;
       for(int i=0;i<arr.length;i++)
       {
             sum+=arr[i];
       }
        return Totalsum-sum;
    }
    public static void main(String args[])
    {

    
    int arr[]={1,2,3,5};
    int n=5;
   
    System.out.println(getmissingNo(arr,n));
    } 
}
