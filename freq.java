import java.util.HashMap;
import java.util.Map;
public class freq {
    
    public static void main(String [] args)
    {
       // int n=2;
        int a[]={ 3,4,5,3,4,5};
       int n=a.length;
       HashMap<Integer,Integer>res=new HashMap<>();
for(int i=0;i<n;i++)
{
    if(res.containsKey(a[i]))
    {
res.put(a[i],res.get(a[i]+1));
    }
    else
    {
        res.put(a[i],1);
    }
}
for(Map.Entry map:res.entrySet())
{
    System.out.println(map.getKey()+"  "+map.getValue());
}
    }
}

