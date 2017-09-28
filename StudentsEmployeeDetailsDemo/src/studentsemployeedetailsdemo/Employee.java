
package studentsemployeedetailsdemo;


public class Employee extends Common
{
    private String dept,des;
    private int sal;
    
    @Override
    public void accept()
    {
        super.accept();
        System.out.println("Enter Department: ");
        dept=k.next();
        System.out.println("Enter Designation: ");
        des=k.next();
        System.out.println("Enter Salary: ");
        sal=k.nextInt();
    }
    
     @Override
     public void display()
    {
        super.display();
        System.out.println("Department is: "+dept);
        System.out.println("Designation is: "+des);
        System.out.println("Salary is: "+sal);
    }
}
