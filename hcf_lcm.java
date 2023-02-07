import java.util.Scanner;


public class hcf_lcm {

// Definition of findhcf method
 static void findhcf(int a,int b)
 {
     int hcf=0;
 for(int i=1;i<=a&&i<=b;i++)
 {
     if(a%i==0&&b%i==0)
     {
         hcf=i;
     }
 }
 
 int lcm;
 lcm=(a*b)/hcf;
 System.out.println("The hcf and lcm is = "+hcf+" and "+lcm);
 
 }
    public static void main(String[]args)
    {

        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        findhcf(a,b);
        

    }
    
}
 