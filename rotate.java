public class rotate {


    static void rotate(int arr[],int l,int h)
    {

while(l<h)
{
 int temp=arr[l];
 arr[l]=arr[h];
 arr[h]=temp;
 l++;
 h--;


}

    }

    static void  printarray(int nums[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[])
    {
int nums[]={ 1,2,3,7,9,5,6,7};

int n=nums.length;
int k=3;
   
rotate(nums,0,n-1);
rotate(nums,0,k-1);
rotate (nums,k,n-1);


printarray(nums,n);


    }


    
}
