import java.util.*;

interface phone
{
void display();
}
interface mobile
{
    final int a=10;  // publis,static 
void no();  // static and abstract methods
}
interface c extends phone,mobile
{
    
}
class a implements mobile ,phone

{
    public void no (){

        System.out.println("interface created"+a);
    }
    public void display()
    {
        System.out.println("extends the interface");
    }
    
   // System.out.prinltn("the value of a="+a);
}
public class interface1 {

    public static void main(String[] args)
    {
       a ans=new a();
       ans.no();
       ans.display();
    }
    
}


