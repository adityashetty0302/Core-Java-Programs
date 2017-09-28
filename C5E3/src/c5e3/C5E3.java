package c5e3;

import java.util.Scanner;

public class C5E3 
{
    public static void main(String[] args) 
    {
        int c,i;
        Scanner s  = new Scanner(System.in);
        System.out.println("Game library ");
        System.out.println("1.Cricket 17");
        System.out.println("2.Fifa 17");
        System.out.println("Select a game");
        c=s.nextInt();
        System.out.println("");
        
        switch (c) 
        {
            case 1:
            PS4 c17 = new Cricket_17();
            c17.menu();
            i=s.nextInt();
            System.out.println("");
            
            switch(i)
            {
                case 1:
                c17.play();
                break;
                        
                case 2:
                c17.compute();
                break;
                        
                case 3:
                c17.display();
                break;
                        
                default:
                System.out.println("Wrong choice");
            }   
            break;
            
            case 2:
            PS4 f=new FIFA_17();
            f.menu();
            i=s.nextInt();
            System.out.println("");
            
            switch(i)
            {
                    
                case 1:
                f.play();
                break;
                        
                case 2:
                f.compute();
                break;
                        
                case 3:
                f.display();
                break;
                        
                default:
                System.out.println("Wrong choice");
            }   
            break;
            
            default:
            System.out.println("Wrong Choice");
                
        }
    }
}
