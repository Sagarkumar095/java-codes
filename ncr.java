import java.util.Scanner;
public class ncr {
    public static int factorial(int a)   // Find factorial
    {
        int fact=1;
        for(int i=0;i<a;i++)
        {
            fact=fact+fact*i;
        }
        return fact;
    } 
public static void find_ncr(int n,int r)  // find ncr 

{
  int fact_n=factorial(n);
  int fact_r=factorial(r);
  int s=n-r;
  int fact_s=factorial(s);
  int ans=fact_n/(fact_r*fact_s);
  System.out.println("The Ncr is"+ans);

}

public static void main(String [] args)
    {
        System.out.println("Enter the value of n and r");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
         find_ncr(n,r);
    }
    
}
