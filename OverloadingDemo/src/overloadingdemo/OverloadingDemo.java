package overloadingdemo;

public class OverloadingDemo 
{
    public static void main(String[] args) 
    {
      display("aditya");
      display("shetty",4);
      System.out.println(786);
    }
    
    public static void display(String n)
    {
        System.out.println(n);
    }
    
    public static void display(String n,int a)
    {
        for(int k=0;k<a;k++)
        {
        System.out.println(n);
        }
        
        
    }
}
