class Dog{
    void show()
    {
        System.out.println("The dog is eating");
    }
}
class Cat extends Dog{
    void show()
    {
        System.out.println(" The cat is meow");
    }
}

public class poly2 {
    public static void main(String args[])
    {
Cat obj=new Cat();
obj.show();
    }

    
}
