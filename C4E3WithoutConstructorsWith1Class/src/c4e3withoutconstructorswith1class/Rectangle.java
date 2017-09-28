
package c4e3withoutconstructorswith1class;

import java.util.Scanner;

public class Rectangle 
{
    double d;
//    String a;
    
    Scanner s = new Scanner(System.in);
    
    public void accept()
    {
        d=s.nextDouble();
//        a=s.next();
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(this.d) != Double.doubleToLongBits(other.d)) {
            return false;
        }
        return true;
    }
}
        
//        @Override
//        public boolean equals(Object obj)
//        {
//           Rectangle b=(Rectangle)obj;
//           if(this.d==b.d&&this.a.equals(b.a))
//           {
//               return true;
//           }
//           return false;
//           
//        }
    
    
    
