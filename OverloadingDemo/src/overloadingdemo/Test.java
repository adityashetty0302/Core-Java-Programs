package overloadingdemo;

public class Test 
{
    public static void main(String[] args) 
    {
        prod(10,20);
        prod(5,2,2);
        prod(2.5,2);
    }
    
    public static void prod(int a, int b)
    {
        System.out.println(a*b);
    }
    public static void prod(int a, int b, int c)
    {
        System.out.println(a*b*c);
    }
    public static void prod(double a, double b)
    {
        System.out.println(a*b);
    }
    
}
