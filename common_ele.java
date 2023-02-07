import java.util.*;
public class common_ele {
    
    public static void main(String[] args)
    {
        ArrayList<Integer>sc=new ArrayList<>();
        int a[]={1,2,3,4,6,8,10};
        int b[]={3,4,7,8,9,10};
        int c[]={3,4,7,8};
        int i=0,j=0,k=0;
       
        while (i < a.length && j < b.length && k < c.length)
        {
            if(a[i]==b[j]&&b[j]==c[k])
            {
               sc.add(a[i]);
               System.out.println(a[i]);
               i++;
               j++;
               k++;
            }
            else if(a[i]<b[j])
            {
                i++;
            }
            else if(b[j]<c[k])
            {
                j++;
            }
            else
            k++;

        }
    }
}
