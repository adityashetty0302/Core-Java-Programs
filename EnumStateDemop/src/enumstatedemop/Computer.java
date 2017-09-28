
package enumstatedemop;

public class Computer 
{
    States st = States.Running;
   
    public void changeSt(States st)
    {
        this.st=st;
        switch(this.st)
        {
            case Running:
            System.out.println("Running invoked");
            break;
            
            case Restart:
            System.out.println("Restart invoked");
            break;
            
            case Shutdown:
            System.out.println("Shutdown invoked");
            break;
            
            case Sleep:
            System.out.println("Sleep invoked");
            break;
            
        }
    }
    
}
