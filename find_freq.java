import java.util.*;

public class find_freq {
    // definition of findfreq
    public static void findfreq(int array[],int n)
    {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            // if(map.containsKey(array[i]))  // find frequency
            // {
            //     map.put(array[i], map.get(array[i]) + 1);
            // }
            // else
            // {
            //     map.put(array[i],1);
            // }
            
        }
        for(Map.Entry<Integer,Integer>ent:map.entrySet())
        {
            System.out.println("key" + ent.getKey()+"values"+" "+ent.getValue());
        }
    }

    public static void main(String[] args)
    {
        int array[]={1,2,3,4,1,2,3,4,9,0,6};
        int n=array.length;
        findfreq(array,n);
    }



}

