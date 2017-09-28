
package constructorsuperdemop;

public class Student extends Human
{
    private String stream;

    public Student(String stream, int id, int age, String name) {
        super(id, age, name);
        this.stream = stream;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("stream is "+stream);
    }
    
    
    
    
}
