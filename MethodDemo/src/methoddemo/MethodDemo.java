package methoddemo;

public class MethodDemo 
{
    public static void main(String[] args) 
    {
       MethodDemo o = new MethodDemo();
       double d;
       
//        System.out.println(o.m1("aditya"));
//        System.out.println(o.m1("jarvis"));
        
        System.out.println("tax is "+o.m2(100));
//        d=o.m2(100);
//        System.out.println("tax is "+d);

        
        
    }
    
//    public String m1(String n)
//    {
////        System.out.println(n);
//        return "hello " +n;
//    }
    
    public double m2(double m)
    {
        return m*.15;
    }
}
