
package studentsemployeedetailsdemo;

import java.util.Scanner;


public class Common 
{
    private String fname,lname;
    private int age, id;
    Scanner k=new Scanner(System.in);
    
    public void accept()
    {
        System.out.println("Enter first name: ");
        fname=k.next();
        System.out.println("Enter last name: ");
        lname=k.next();
        System.out.println("Enter age: ");
        age=k.nextInt();
        System.out.println("Enter id: ");
        id=k.nextInt();
        
    }
    
   public void display()
   {
   
       System.out.println("First name is: "+fname);
       System.out.println("Last name is: "+lname);
       System.out.println("Age is: "+age);
       System.out.println("Id is: "+id);
       
       
       
   }
            
    
}
