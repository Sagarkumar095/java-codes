public class countsetbits {

    public static void countsetbit(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {

            while(i>0)
            {
                if((i&1)!=0)
                {
                    count++;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int n=4;
        countsetbit(n);
    }
    
}
