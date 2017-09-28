
package studentsemployeedetailsdemo;


public class Student extends Common
{
    private String course;

    

    @Override
    public void accept() {
    super.accept();
    System.out.println("Enter course: ");
    course = k.next();
       
        
        
    }
    
    @Override
    public void display() {
    super.display();
    System.out.println("Course enrolled: "+course);
        
    }
    
    
    
}
