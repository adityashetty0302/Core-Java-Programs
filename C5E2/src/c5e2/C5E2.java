package c5e2;

import java.util.Scanner;

public class C5E2 
{
    public static void main(String[] args) 
    {
        int c;
        Scanner s=new Scanner (System.in);
        System.out.println("----menu----");
        System.out.println("1.circle");
        System.out.println("2.rectangle");
        System.out.println("3.triangle");
        System.out.println("4.square");
        System.out.println("enter choice of which area is to be calculated");
        c=s.nextInt();
                
        switch(c)
        {
            case 1:
            Shapes C=new Circle();
            C.calArea();
            break;
            
            case 2:
            Shapes r=new Rectangle();    
            r.calArea();
            break;
            
            case 3:
            Shapes t=new Triangle();    
            t.calArea();
            break;
            
            case 4:
            Shapes S=new Square();    
            S.calArea();
            break;
            
            default:
            System.out.println("wrong choice");
                
            
            
        }
    }
}
