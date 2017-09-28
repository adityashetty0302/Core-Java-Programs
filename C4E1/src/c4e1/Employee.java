
package c4e1;

//import java.util.Scanner;

public class Employee 
{
   private int id;
   private String name;
   private String des;
   private String dept;
 
    public Employee(int id, String name, String des, String dept) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", des=" + des + ", dept=" + dept + '}';
    }
    
    
    
   
   
}
