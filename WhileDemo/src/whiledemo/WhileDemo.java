package whiledemo;

public class WhileDemo 
{
    public static void main(String[] args) 
    {
        m1();
//        m2();
    }
    
    public static void m1()
    {
        int i=1;
        while(i<=4)
        {
            
            System.out.println("Aditya "+i);
            i++;
        }
    }
    
    public static void m2()
    {
        int i=1;
        while(true)
        {
            System.out.println("aditya "+i);
            if(i==8)
            {
                System.exit(0);
            }
            i++;
        }
    }
    
    
}
