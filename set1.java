import java .util.ArrayList;
public class set1 {
    public static void main(String [] args)
    {

   ArrayList list=new ArrayList();
   list.add(4);
   list.add("hii");
   list.add(4.45f);
   list.add('x');
   int a= (int)list.get(2);
   System.out.println(a); 

}
}