public class pattern {
    public static void main(String[] args)
    { 
        int n=5;
    //     for (int r=1;r<=n;r++)
    //     {
    //         for(int c=1;c<=n-r+1;c++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // for (int r=1;r<=n*2;r++)
    // {
    //     int totalcol=r>n? 2*n-r:r;
    //     for(int c=1;c<totalcol;c++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    for (int r=1;r<=n*2;r++)                     // Diamond pattern
    {
        int totalcol=r>n? 2*n-r:r;
        int totalspace=n-totalcol;
        for(int s=0;s<totalspace;s++)
        {
            System.out.print(" ");
        }
        for(int c=1;c<totalcol;c++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
     }
    

