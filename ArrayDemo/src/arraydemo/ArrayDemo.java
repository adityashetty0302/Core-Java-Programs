package arraydemo;

import java.util.Scanner;

public class ArrayDemo 
{
    public static void main(String[] args) 
    {
//        nysm();
        nyd();
        
    }
    
    public static void nysm()
    {
//      String[] magic = new String[]{"now","you","see","me"};
        String[] magic = {"now","you","see","me"};
        
//        for(int i=0;i<magic.length;i++)
//        {
//            System.out.println(magic[i]);
//        }
        
        
        for(String n:magic)
        {
            System.out.println(n);
        }
        
        
    }
    
    public static void nyd()
        {
            
            String[] magics = new String[3];
            Scanner s = new Scanner(System.in);
            
            for(int i=0;i<=2;i++)
            {
            magics[i]=s.next();
            }
            
            for(String i:magics)
            {
                System.out.println(i);
            }
            
        }
    
}
