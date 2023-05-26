import java.util.*;
public class longestsub {

    public static int findsub(String str)
    {
        int max=0;
        Set<Character>set=new HashSet<>();
        int j=0;
        for(int i=0;i<str.length();i++)
        {
            if(!set.contains(str.charAt(i)))
            {
               set.add(str.charAt(i));
                   max=Math.max(max,set.size());
            }
            else
            {
                set.remove(str.charAt(j));
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        String str="geeksforgeeks";
        System.out.println(findsub(str));
    }
    
}
