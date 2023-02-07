import java.util.*;
public class arrys2 {

    static void findmax_small(int n,int arr[])
    {

        int max=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        // find first max and small numbers
        for(int i=0;i<n;i++)
        {
           
            small=Math.min(small,arr[i]);
            max=Math.max(max,arr[i]);
        }

        // find seocnd max and small
        int second_small=Integer.MAX_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
           
           if(second_small>arr[i]&& arr[i]!=small)
           {
               second_small=arr[i];
               
           }
           if(second_max<arr[i]&&arr[i]!=max)
           {
               second_max=arr[i];

             
           }
        }
       
        System.out.println(second_small);
        System.out.println(second_max);
        
    }
    public static void main(String[] args)
    {
        int n=8;

        System.out.println("Enter the number of array");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
      findmax_small(n,arr);

    }
    
}
