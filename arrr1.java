
import java.net.SocketPermission;
import java.util.*;

public class arrr1 {
    public static void main(String[] args)
    {
        List <String>list=new ArrayList<>();
        list.add("skdf fgdgfdkj ");
        list.add("dfskjkjdkj");
        list.add("dkf");
        // list.add(9);
        // list.add(12);
        // list.add(8);
//         for(int i=0;i<list.size();i++)  // print list data using for loop in a array form
//         {
// System.out.println(list.get(i));
//         }


//         for(int a:list)   // for each loop
//         {
//             System.out.println(a);
//         }
         
//         System.out.println(list+" "); // print using lsit method

        // printing list element using iterator method
        Iterator it= list.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
            //int a=it. next();
           
        }
        System.out.println(list+" ");
        // Tree map also called
        
    }
    
}
