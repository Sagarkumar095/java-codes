import java.util.Scanner;
public class hexatodeci {
    
  public static void main (String[]args)
  {
    System.out.println("Enter the hexadecimal no ");
Scanner sc=new Scanner(System.in);
	  
	  String hex=sc.nextLine();
    hex=hex.toUpperCase();
    String digits="0123456789ABCDEF";
    int val=0;
    for(int i=0;i<hex.length();i++)
   {
     char c=hex.charAt(i);
     int d=digits.indexOf(c);
     val=16*val+d;
   }
System.out.println("the decimal no is= "+val);

}


  }  

