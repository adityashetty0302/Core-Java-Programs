package staticdemop;

//import static staticdemop.MyTest.f2;
//import static java.lang.Math.PI;

public class Test 
{   
    
    int a;
    static int b;
    
    public void m1()
    {
        a=1;
        b=2;
        
        System.out.println(a);
        System.out.println(b);
    }
    
    public static void m2()
    {
        Test k=new Test();
        k.a=1;
        b=2;
        
        System.out.println(k.a);
        System.out.println(b);
    }
    
    public static void main(String[] args) 
    {
        
       
         new Test().m1();
         m2();
//        f2();

//        System.out.println("value of pi is "+PI);
    }
}
class MyTest
{
    public void f1()
    {
        
    }
    public static void f2()
    {
        
    }
}
