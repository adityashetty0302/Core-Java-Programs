
package swhw;


public class Hardware extends Common 
{
    private String hwcat;
    private String pub;
   
    public void accept()
    {
        super.accept();
        System.out.println("Enter Hardware Category: ");
        hwcat = s.next();
        System.out.println("Enter Publisher: ");
        pub = s.next();
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Hardware Category: "+hwcat);
        System.out.println("Publisher: "+pub);
    }
}
