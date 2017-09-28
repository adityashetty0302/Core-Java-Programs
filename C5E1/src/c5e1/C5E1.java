package c5e1;

import java.util.Scanner;

public class C5E1 
{
    public static void main(String[] args) 
    {
       int c; 
       Scanner k = new Scanner (System.in);
       
        System.out.println("---menu---");
        System.out.println("1.Chair");
        System.out.println("2.bs");
        System.out.println("enter choice");
        c=k.nextInt();
        
        if(c==1)
        {
            Furniture ch = new Chair();
            
            ch.accept();
            System.out.println("");
            ch.display();
         }
        else
        {
            Furniture bs = new BookShelves();
            
            bs.accept();
            System.out.println("");
            bs.display();
        }
        
    }
}
