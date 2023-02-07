public class freq_nn {
    
    public static void main(String[] args)
    {
        int a[]={2,3,4,5,2,3,4,5,0,4,4,2,0};
int n=a.length;
     int freq[]=new int[n];

     int visited=-1;
     for(int i=0;i<n;i++)
     {
         int count=1;
         for(int j=i+1;j<n;j++)
         {
             if(a[i]==a[j])
             {
                 count++;
                 freq[j]=visited;
             }
         }
         if(freq[i]!=visited)
         {
           freq[i]=count;  
         }
     }
     for(int i=0;i<n;i++)
     {
         if(freq[i]!=visited)
         {
             System.out.println("the frequency of the each element is"+a[i]+" "+freq[i]);
         }
     }
    }
    
}
