package dowhiledemo;

import java.util.Scanner;

public class DoWhileDemo 
{
    public static void main(String[] args) 
    {
        do
        {
            menu();
        }while(true);
        
        
    }
    
    
    public static void menu()
    {
         int c;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("---Menu---");
        System.out.println("1. Enter Data");
        System.out.println("2. Display Data");
        System.out.println("3. Exit");
        System.out.println("Choose the option");
        c=s.nextInt();
        
        switch(c)
        {
            case 1:
                enterData();
                break;
                
            case 2:
                displayData();
                break;
                
            case 3:
                exit();
                break;
                
            default:
                System.out.println("Invalid Input...Try again...");
        }
    }
    
    public static void enterData()
    {
        System.out.println("enterData method is invoked");
        System.exit(0);
    }
    public static void displayData()
    {
        System.out.println("displayData method is invoked");
        System.exit(0);
    }
    public static void exit()
    {
        System.out.println("exit method is invoked");
        System.exit(0);
    }   
}
