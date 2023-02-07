import java.util.Scanner;

public class j2 {
    public static void main(String [] args)
    {                                       // Check no is odd or even

        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // if(n%2==0)
        // {
        // System.out.println("the no is even");

        // }
        // else{
        //     System.out.println("the no is odd");
        // }                                         // Using Ternary Operator
        String ans=n%2==0? "is Even":"is Odd";
        System.out.println(ans);
        // }
    }
    
}
