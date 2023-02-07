public class str33 {

// define the  reverse method
public static void reverse(int arr[],int l,int h)
{
        while(l<h)
        {  
        int temp=arr[l];
                arr[l]=arr[h];
                arr[h]=temp;
                l++;
                h--;
        }
}
static void printarray(int arr[],int n){
for(int i=0;i<n;i++)
{
  System.out.print(arr[i]+" ");
}

}
    public static void main (String [] args)
    {

     
       int arr[]={1,2,3,4,5,6,7};
       int k=3;
                int n=arr.length;
                k=k%n;
                
                reverse(arr,0,n-1); // reverse the complete array
                reverse(arr,0,k-1); // reverse first part of the array
                reverse(arr,k,n-1); // reverse second part of the array
                printarray(arr,n);
            
        }
            




  
    
    }
    
  
