public class rec1 {
    public static void printfact(int n,int fact)
    {
        if(n==0)     // Base condition
        {
            System.out.println(fact);  // Logic print
            return ;
        }
        // Recursively fun calls
        fact*=n;
        printfact(n-1,fact);

    }
    public static void main(String[] args){

int n=5;
printfact(n,1);

}}