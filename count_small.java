public class count_small {
    public static void main(String [] args)
    {
        int a[]={12,1,3,5,50};
        int count=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
