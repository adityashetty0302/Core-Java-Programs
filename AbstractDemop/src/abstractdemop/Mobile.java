
package abstractdemop;

public class Mobile extends Gadget
{

    @Override
    public void turnOn() 
    {
        System.out.println("mobile is turned on ");
    }

    @Override
    public void turnOff() 
    {
        System.out.println("mobile is turned off");
    }
    
}
