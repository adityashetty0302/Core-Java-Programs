
package c5e3;

public abstract class PS4 
{
    
    public void menu()
    {
        System.out.println("Game menu");
        System.out.println("1.Play game");
        System.out.println("2.Compute the scores");
        System.out.println("3.Display the scores");
        
    }
    
    public abstract void play();
    
    public abstract void compute();
    
    public void display()
    {
        System.out.println("Displaying scores");
    }
}
