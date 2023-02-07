import java.util.*;
public class sums {

    public static void main(String[] args)
    {


    System.out.println(" Enter the number");
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int mod=0;
while(n>0)
{
    mod=n%10;
    sum+=mod;
    n=n/10;

}
System.out.println("The sum of digits is ="+ sum);
    }
    
}
