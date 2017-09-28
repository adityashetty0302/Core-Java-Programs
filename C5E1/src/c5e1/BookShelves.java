
package c5e1;

public class BookShelves extends Furniture
{

    private int nob;

    @Override
    public void display() 
    {
        super.display();
        System.out.println("nob is "+nob);
    }

    @Override
    public void accept() 
    {
        super.accept();
        System.out.println("enter nob");
        nob=s.nextInt();
    }
    
    
    
     
}
