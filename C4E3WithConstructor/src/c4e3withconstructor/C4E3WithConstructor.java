package c4e3withconstructor;

import java.util.Scanner;

public class C4E3WithConstructor 
{
    public static void main(String[] args) 
    {
       double ln;
       double br;
       
       Scanner s = new Scanner(System.in);
       
        System.out.println("enter length ");
        ln=s.nextDouble();
        System.out.println("enter breadth ");
        br=s.nextDouble();
        
        Rectangle l = new Rectangle(ln);
        Rectangle b = new Rectangle(br);
        
        if(l.equals(b))
        {
            System.out.println("both are same");
        }
        
        else
        {
            System.out.println("both are different");
        }
                
                
    }
}
