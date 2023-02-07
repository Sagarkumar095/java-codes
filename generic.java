public class generic {
   static <T> void genericprint(T t)
    {
        System.out.println(t);
    }
    public static  void main(String[] args)
    {
       //  generic obj;
        genericprint(101);
        genericprint("hello");

        genericprint(34.245);


    }
    
}
