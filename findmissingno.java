public class findmissingno {

 public static int getmissingno(int [] arr,int n)
 {
     int Totalsum=(n*(n+1))/2;  
     
     int sum=0;
     for(int i=0;i<arr.length;i++)
     {
         sum+=arr[i];
     }

     return Totalsum-sum;
 }

    public static void main (String args[])
    {
       
        int arr[]={ 5 ,7, 8, 4, 6, 1, 3 ,9  };
        int n=9;
        System.out.println(getmissingno(arr,n));
    }
    
}
