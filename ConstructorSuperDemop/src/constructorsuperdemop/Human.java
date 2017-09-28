
package constructorsuperdemop;

public class Human 
{
    private int id,age;
    private String name;

    public Human(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    
    public void display()
    {
        System.out.println("id is "+id);
        System.out.println("name is "+name);
        System.out.println("age is "+age);
    }
}
