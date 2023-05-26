import java .util.*;
public class gfg1 {

   
    public static void main(String[] args)
    {
       
              int n=5;
              int m=2;
              int arr[]={5, 8 ,11 ,40, 15};
              int first=0;
              int last=0;
              Arrays.sort(arr);
              int i=0;
              while(i<m)
              {
                  first+=arr[i];
              }
              i=n-1;
              int c=0;
              System.out.println("kfkjfsda");
              while(c<m)
              {
                  last+=arr[i];
                  i--;
                  c++;
              }
              System.out.println(last-first);
              System.out.println("ans");


    }
    
}
