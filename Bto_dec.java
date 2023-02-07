
// convert the Binary to Decimal number

import java.util.Scanner;

public class Bto_dec {
    static int decimal(int binary)
    {
        int decimal=0;
        int n=0;
        while(binary>0)
        {
            int r=binary%10;
            decimal+=r* (int)Math.pow(2,n);
            n++;
            binary=binary/10;
        }

        return decimal;
    }

    public static void main(String[] args)
    {
  System.out.println("Enter the Binary Number");
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();

        System.out.println("The Decimal number is=");
        int no=decimal(binary);
        System.out.println(no);
    }
}
