
package c5e2;

public class Circle extends Shapes
{
    double pi=3.14;
    double r;

    @Override
    public void calArea() 
    {
        System.out.println("enter radius");
        r=s.nextDouble();
        a=pi*r*r;
        System.out.println("area of circle is "+a);
    }
    
}
