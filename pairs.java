import java.util.Scanner;

public class pairs {

    public static void findpair (int arr [],int n)
    {
        int pair=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
       
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")"); // print the pair
                pair++;
                sum=arr[i]+arr[j];
               min= (sum<min)? sum:min;
            }
            System.out.println();
        }
        System.out.println("The total pairs is "+ pair);
        System.out.println("the smallest sum of pairs is "+min);
    }
    public static void main(String[] args)
    {
        int n=5;
    // int arr[]=new int[n];
    
    // System.out.println("Enter the array element");
    // Scanner sc=new Scanner(System.in);
    // for(int i=0;i<n;i++)
    // {
    //     arr[i]=sc.nextInt();
    // } 
    int arr[]={1,2,3,4,5};
    findpair(arr,n);
    }
    
}
