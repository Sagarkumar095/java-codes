import java.util.Arrays;
import java.util.Scanner;

public class sortstr {
    public static void main(String[]args)
    {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();            // input string 
        String sorted="";
        char chararr[]=str.toCharArray();   // string to convert char arrays 
        Arrays.sort(chararr);                   // sorting 
       
        System.out.println(String.valueOf(chararr));  // sorted string print
        sorted=String.valueOf(chararr);
        System.out.println(sorted);   
        
    }
}

