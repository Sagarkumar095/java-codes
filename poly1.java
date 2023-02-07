class A{
    void show(int a)
    {
    
        System.out.println("super class is called"+"" +a);  // method overloading  
    }
}
class B extends A{

    void show(int a,int b)
    {
        
        System.out.println(a+" "+b);
    }
}


public class poly1 {
public static void main (String args[])
{

    B obj=new B();
    obj.show(5);
}    

    
}
