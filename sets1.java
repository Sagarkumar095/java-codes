import java.util.*;

public class sets1 {
    public static void findqunique(int ar[],int n)
    {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(ar[i]);
        }
        for(int i=0;i<set.size();i++)
        {
            System.out.println(i);
        }
        System.out.println();
        System.out.println(set);
    }
    public static void main(String[] args)
    {
       
       int ar[]={1,2,3,4,5,6,1,2,3,};
       int n=ar.length;
       findqunique(ar,n);
    }
    
}
