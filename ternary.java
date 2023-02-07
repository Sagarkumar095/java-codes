public class ternary {                 
    public static void main(String[] args)
    {
        int a=14,b=100,c=50;      //  find largest number 
       //  int lar=(a>b)?(a>c?a:c):(b>c?b:c);
       int lar=(a>b&&a>c)?a:(b>c)?b:c;
        System.out.println("The largest of three numbers is= "+lar);
    }
    
}
