 import java.util.Scanner;
 public class j1 {
    public static void main(String [] args)   // check number is positive or negative
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println("the no is positive");
        }
        else if(n==0)
        {
            System.out.println(" the no is zero");
            
        }
        else
        {
            System.out.println("the no is negative");
        }
    }
    
}
