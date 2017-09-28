
package c5e2;

public class Square extends Shapes
{
    double sd;

    @Override
    public void calArea() 
    {
        System.out.println("enter sides value");
        sd=s.nextDouble();
        a=sd*sd;
        System.out.println("area of square is "+a);
    }
    
    
}
