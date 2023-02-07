public class selection_sort {
    // sorting method definition
    static void ssort(int a[])
    {
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0&& a[j]>key)       // Insertion sort
            {
                a[j+1]=a[j];
                j--;
                
            }
            a[j+1]=key;
        }

    }
    // for Print the array
    static void printarray(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int a[]={5,3,0,2,1};
        ssort(a);
        System.out.println("After sorted");
        printarray(a);
    }
}