 import java.util.*;
 public class dublicate_arr {
    public static int finddublicate(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }

        }
        return -1;
 
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the array size");
         try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            System.out.println("Enter the array elements");
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int res=finddublicate(arr,n);
            System.out.println("the dublicate element is "  + res);
        }



    }
    
} 
