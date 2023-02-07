public class quick_sort {

    public static int partition(int arr[],int low,int high)
{
  
    int i=low-1;
    int j=high;
    int pivot=arr[low];
    while(i<j)
    {
        while(pivot>=arr[i])
        {
            i++;
        }
        while(pivot<arr[j])
        {
            j--;
        }
        if(i<j)
        {
            // swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    // swap with pivot element
    int temp=arr[low];// pivot 
    arr[low]=arr[high];
    arr[high]=temp;
    return j;   // return pivot index
        
     }
 

public static void quicksort(int arr[],int low,int high)
{
    if(low<high)
    {
    int pind=    partition(arr,low,high);
        quicksort(arr,low,pind-1);
        quicksort(arr,pind+1,high);
}
}

// print the array
public static void printarray(int arr[],int n)
{
for(int i=0;i<n;i++)
{
    System.out.print(arr[i]+"  ");
}
}
    public static void main(String[] args)
    {
        int arr[]={6,3,9,1,4,0,10};
        int n=arr.length;
        quicksort(arr,0,n-1);
        
        printarray(arr,n);
    }
    
}
