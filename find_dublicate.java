
public class find_dublicate {

   
//     public static void dublicate(int arr[])
//     {
// //         int ans=0;
// //         Map<Integer,Integer>map=new HashMap<>();
// //         for(int i=0;i<arr.length;i++)
// //         {
// //             if(map.containsKey(arr[i]))
// //             {
// //                map.put(arr[i],map.get(arr[i]+1));
// //             }
// //             map.put(arr[i],1);
// //         }
// //        // return 0;
// //        for(map.Entry<integer.Integer>m:map.entrySet())
// //        {
// //            if(map.get(arr[i])>1)
// //            {
// // System.out.println(map.get(i));
// //            }
// //        }

//     }

    public static void main(String[] args)
    {
        int arr[]={1,2,2,3,5,6,3};
       // dublicate(arr);
       // 



System.out.println(findbit(arr));
//

    }
    public static int findbit(int arr[])
    {
        int x=0;
        int y=0;
        for(int i=0;i<arr.length;i++)
        {
            x=x^arr[i];
            
        }
        for(int i=0;i<arr.length;i++)
        {
            y=y^arr[i];
            
        }
        return x^y;
    }
    
}
