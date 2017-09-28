
package c5e1;

import java.util.Scanner;

public abstract class Furniture 
{
    private double p;
    private double w;
    private double h;
   
    Scanner s = new Scanner (System.in);
    
    
    public void accept ()
    {
        System.out.println("enter price");
        p=s.nextDouble();
        System.out.println("enter width");
        w=s.nextDouble();
        System.out.println("enter height");
        h=s.nextDouble();
    }
    
    
    
    public void display()
    {
        System.out.println("price is "+p);
        System.out.println("width is "+w);
        System.out.println("height is "+h);
        
    }
    
    
}
