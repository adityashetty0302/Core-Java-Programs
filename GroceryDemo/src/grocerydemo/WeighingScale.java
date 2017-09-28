
package grocerydemo;

import java.util.Scanner;

public class WeighingScale 
{
    String product;
    int weight, add, addtotal, remove, removetotal;
    
    public void accept()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter product name: ");
        product = s.next();
        System.out.println("Enter weight: ");
        weight = s.nextInt();
    }
    
    public void display()
    {
        System.out.println("Product Name: "+product);
        System.out.println("Product Weight: "+weight);  
    }
    
    public void add()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter weight to be added: ");
        add = s.nextInt();
        addtotal=add+weight;
        System.out.println("Total weight is: "+addtotal);
        System.exit(0);
    }
    
     public void remove()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter weight to be removed: ");
        remove = s.nextInt();
        removetotal=weight-remove;
        System.out.println("Total weight is: "+removetotal);
        System.exit(0);
    }
     
    public void current()
    {
        System.out.println("Current Weight is: "+weight);
    }
    
     public void exit()
    {
        System.exit(0);
    }       
}
