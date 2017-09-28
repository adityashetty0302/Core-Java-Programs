
package constructorsuperdemop;

public class Teacher extends Human
{
    private int sal;

    public Teacher(int sal, int id, int age, String name) {
        super(id, age, name);
        this.sal = sal;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("salary is "+sal);
    }
    
    
    
    
}
