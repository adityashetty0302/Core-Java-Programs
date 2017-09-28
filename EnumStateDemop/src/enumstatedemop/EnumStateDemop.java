package enumstatedemop;

public class EnumStateDemop 
{
    public static void main(String[] args) 
    {
       Computer c=new Computer();
     
       c.changeSt(States.Restart);
       c.changeSt(States.Running);
       c.changeSt(States.Shutdown);
       c.changeSt(States.Sleep);
    }
}
