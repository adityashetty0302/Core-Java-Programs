
package studentsemployeedetailsdemo;

import java.util.Scanner;

public class StudentsEmployeeDetailsDemo 
{

    public static void main(String[] args) 
    {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("---Menu---");
        System.out.println("1. Employee");
        System.out.println("2. Student");
        System.out.println("Enter Choice");
        i=s.nextInt();
        
        switch(i)
        {
            case 1:
            Employee e1 = new Employee();
            e1.accept();
            e1.display();
            
            break;
            
            case 2:
            Student s1 = new Student();
            s1.accept();
            s1.display();
            break;
            
            default:
            System.out.println("Invalid Input");
        }
        
    }
}
