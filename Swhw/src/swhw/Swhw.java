package swhw;

import java.util.Scanner;

public class Swhw 
{
    public static void main(String[] args) 
    {
       int i;
       Scanner c = new Scanner(System.in);
       System.out.println("-----Menu----");
       System.out.println("1. Software");
       System.out.println("2. Hardware");
       System.out.println("Enter choice: ");
       i = c.nextInt();
       
       
       switch(i)
       {
           case 1:    
           Software s1 = new Software();
           s1.accept();
           s1.display();
           break;
           
           case 2:
           Hardware h1 = new Hardware();
           h1.accept();
           h1.display();
       }

//       Common h = new Hardware();     //This is also correct.
//       h.accept();
//       h.display();
    }
      
}
