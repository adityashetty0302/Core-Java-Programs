package overloadingdemo;

public class VarArgs 
{
    public static void main(String[] args) 
    {
       prod();
       prod(10);
       prod(10,20);
       prod(10,20,30);
       
    }
    
    public static void prod(int... a)
    {
        int t=1;
//        for(int i:a)
//        {
//            t*=i;
//        }

        for(int i=0;i<a.length;i++)
        {
            t*=a[i];
        }
            
        System.out.println(t);
        
        
                
    }
}
