
package swhw;


public class Software extends Common 
{
    private String swname;
    private int swver;
    
    @Override 
    public void accept()
    {
        super.accept();
        System.out.println("Enter Software Name: ");
        swname = s.next();
        System.out.println("Enter Software Version: ");
        swver = s.nextInt();
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Software Name: "+swname);
        System.out.println("Software Name: "+swver);
    }
}
