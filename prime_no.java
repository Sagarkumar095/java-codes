public class prime_no {
   // private static Object Static;

    public static void main(String[] args)     //check no is prime or not
    {
     int n=0;
        int count=0;
        for(int i=1;i<=n/2;i++)
        {
        if(n%i==0)
        {
            count++; //System.out.println()
           }   

        }
        if(count==1)
        {
            System.out.println(" prime");
        }


        else
        {
            System.out.println("not  prime"); 
        }
//         int count=0;
// for(int i=n;i<=n2;i++)
// {
//     for(int j=2;j<i/2;j++)
//     {
//         if(j%2==0)
//         {
//             count++;
//         }
//     }
//     if(count==0)
//     {
//         System.out.println(i);  // find number is prime or not 

//     }
}
}

   