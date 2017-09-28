package grocerydemo;

import java.util.Scanner;

public class GroceryDemo 
{
    public static void main(String[] args) 
    {
        WeighingScale customer1 = new WeighingScale();
        
        customer1.accept();
        customer1.display();
        
        do
        {
        int c;
        Scanner s = new Scanner(System.in);
        System.out.println("----Menu----");
        System.out.println("1. Add Weight");
        System.out.println("2. Remove Weight");
        System.out.println("3. Display current Weight");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        c = s.nextInt();
        
        
        switch(c)
        {
            case 1:
            customer1.add();
            break;
            
            case 2:
            customer1.remove();
            break;
            
            case 3:
            customer1.current();
            break;
            
            case 4:
            customer1.exit();
            break;
            
            default:
            System.out.println("Wrong Choice ");
        }
        }while(true);
        
        
    }
}
