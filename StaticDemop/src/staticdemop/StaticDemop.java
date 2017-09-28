package staticdemop;

public class StaticDemop 
{
    public static void main(String[] args) 
    {
         
       Demo a=new Demo();
       Demo b=new Demo();
       
//        System.out.println("No. of objects is "+a.i);
//        System.out.println("No. of objects is "+b.i);
        System.out.println("No. of object is "+Demo.getCount());
    }
}
class Demo
{
    private static int i=0;
    
    public Demo() 
    {
        i++;
    }
    
    public static int getCount()
    {
        return i;
    }
    
  
}