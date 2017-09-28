
package c5e2;

public class Triangle  extends Shapes
{
    private double b;
    private double h;
    
    
    @Override
    public void calArea() 
    {
        System.out.println("enter b ");
        b=s.nextDouble();
        System.out.println("enter h ");
        h=s.nextDouble();
        a=1*b*h/2;
        System.out.println("area of triangle is "+a);
        
    }
    
}
