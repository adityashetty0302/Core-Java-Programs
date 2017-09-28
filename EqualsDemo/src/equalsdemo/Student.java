
package equalsdemo;

import java.util.Objects;

public class Student 
{
    private int id ;
    private String name;
    private String str;

    public Student(int id, String name, String str) {
        this.id = id;
        this.name = name;
        this.str = str;
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

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 53 * hash + this.id;
//        hash = 53 * hash + Objects.hashCode(this.name);
//        hash = 53 * hash + Objects.hashCode(this.str);
//        return hash;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Student other = (Student) obj;
//        if (this.id != other.id) {
//            return false;
//        }
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//        if (!Objects.equals(this.str, other.str)) {
//            return false;
//        }
//        return true;
//    }

   
    
    
    
}
