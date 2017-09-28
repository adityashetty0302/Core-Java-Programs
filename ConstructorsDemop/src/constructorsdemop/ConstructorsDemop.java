package constructorsdemop;

public class ConstructorsDemop 
{
    public static void main(String[] args) 
    {
       Manager m = new Manager(100,"aditya","java");
       
        System.out.println("id is: "+m.getId());
        System.out.println("name is  "+m.getName());
        System.out.println("dept is "+m.getDept());
        
        MyClass h = new MyClass();
    }
    
      
}
class MyClass
    {

    public MyClass() {
    }
       
    }
