import java.util.HashMap;
import java.util.Map;
public class hashmap1 {
    public static void main(String[]args)
    {
        HashMap<Integer,String>map=new HashMap<>();
       // System.out.println(map.size());
       // System.out.println(HashMap.capacity());
      map.put(1,"i");
      map.put(5,"v");
      map.put(10,"x");
      map.put(20,"xx");
      for(Map.Entry<Integer,String> st:map.entrySet())
      {
   System.out.println("the key is= "+st.getKey()+"  The value of the key is=  "+st.getValue());
      }
      System.out.println(map.size());
     //  System.out.println(Map.capacity());



    }
    
}
