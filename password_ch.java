import java.util.Scanner;
public class password_ch {
    public static int checkpassword(String str,int n)
    {
        if(n<4)
        {
            return 0;
        }
        if(str.charAt(0)>='0'&& str.charAt(0)<='9')
        {
            return 0;
        }
        int num=0,cap=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ' || str.charAt(i)=='/')
            {
                return 0;
            }
            if(str.charAt(i)>='0'&& str.charAt(i)<='9')
            {
                num++;
            }
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
                cap++;
            }

        }
        if(num>0&&cap>0)
        {
            return 1;
        }
else{
        return 0;
    }
}
    public static void main(String [] args)
    {

        System.out.println("Enter your password");
        Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     System.out.println(checkpassword(str,str.length()));
    }
    
}
