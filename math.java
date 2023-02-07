public class math {
    static int  findhcf(int a,int b)
    {
        int sum=0;
        for(int i=1;i<=a&&i<b;i++)
        {
            if(a%i==0&&b%i==0)
            {
                sum=i;
            }
            
        }
        return sum;
    }
    public static void main(String[]argds)
    {

        int a=12,b=60;
        int hcf=findhcf(a,b);
        System.out.println("The hcf of two no is= "+hcf);  // print hcf
        int lcm=(a*b)/hcf;
        System.out.println("The LCM of two no is= "+lcm);  // print lcm
    }
    
}
