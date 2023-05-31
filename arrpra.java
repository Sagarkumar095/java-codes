public class arrpra {

    public static void main(String[]args)
    {
          int a=12345;
          int first=0;
          int last=0;
          while(a>0)
          {
              int rem=a%10;
              a=a/10;
              if(last==0)
              {
                last=rem;

              }
              first=rem;
             
          }
          System.out.println("The first and last number is="+first+" "+last);
    }
    
}
