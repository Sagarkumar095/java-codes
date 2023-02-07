import java.util.Scanner;

public class dtohexa {
    
public static  void main(String[]args)
{
    System.out.println("Enter any Decimal Number");
    Scanner sc=new Scanner(System.in);
    char hexa[]=new char[100];
    int num=sc.nextInt();
    int temp=num;
  int j=0;
   while(temp>0)
   {
       int rem=temp%16;
       if(rem<10)
       {
        hexa[j++]=(char)(48+rem);
       }
       else
       {
           hexa[j++]=(char)(55+rem);
       }
       temp=temp/16;

    

   }
   for(int i=j-1;i>=0;i--)
   {
       System.out.print(hexa[i]+" ");
   }
}
}

