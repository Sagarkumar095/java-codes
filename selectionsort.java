public class selectionsort {

    public static void selectionsort(int [] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int index=i;

            for(int j=i+1;j<arr.length;j++)
            {
                      if(arr[j]<arr[index])
                      {
                          index=j;  // searching for lowest index
                      }
            }
            int smallno=arr[index];
            arr[index]=arr[i];
            arr[i]=smallno;
        }
    }

    public static void main (String args[])
    {
     int arr[]={ 9,14,3,1,7,11,100,0};

     selectionsort(arr);

     System.out.println(" After selection sort");
     for(int i=0;i<arr.length;i++)
     {
         System.out.print(arr[i]+" ");
     }
    }
    
}
