public class reverse_arr {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int n=a.length;
        int i=0,j=n-1;
        //int mid=(i+j)/2;
;        // int b[]=new int [n];
        while(i<j)
        {
            
            a[j]=a[i];

        }
        i++;
        j--;
    
    for(j=0;j<n;j++)
    {
        System.out.println(a[j]);
    }
    
    System.out.println("Madarchod");
}
}
