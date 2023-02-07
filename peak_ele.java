public class peak_ele {
   
    public static void main(String []args)     //find peak element.
    {
       int a[]={2,20,4,50,10,5}; 
       int n=a.length;
          int peak=0;                          // 0(n)
       for(int i=0;i<n;i++)
       {
           if(peak<a[i])
           {
               peak=a[i];
           }
       } 
       System.out.println(peak);                     

       
    }
}
