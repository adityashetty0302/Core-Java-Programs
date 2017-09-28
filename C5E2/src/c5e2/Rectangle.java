
package c5e2;

public class Rectangle extends Shapes
{
    double l;
    double w;
    @Override
    public void calArea() 
    {
        System.out.println("enter length");
        l=s.nextDouble();
        System.out.println("enter width");
        w=s.nextDouble();
        a=l*w;
        System.out.println("area of rectangle is "+a);
    }
    
}
