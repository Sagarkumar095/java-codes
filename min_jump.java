public class min_jump {
public static int findjump(int arr[])
{

      int maxr=arr[0];
      int step=arr[0];
      int jump=1;
        if(arr.length==1)
        {
              return 0;
        }
      for(int i=1;i<arr.length;i++)
      { if(i+arr[i]>maxr)
           {
                 step--;
                 maxr=i+arr[i];
           }
           if(step==0)
           {
                 jump++;
                 step=maxr-1;
           }
     
      }
      return jump;
}
    public static void main(String[] args)
    {
       // System.out.println("kfdfd");
       int arr[] = {1, 4, 5, 8, 2, 6, 7, 6, 8, 9};
             // ans=3;
            int j=findjump(arr);
            System.out.println(j);
            
    }
    
}
