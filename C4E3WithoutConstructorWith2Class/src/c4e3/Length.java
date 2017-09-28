
package c4e3;


import java.util.Scanner;

public class Length 
{
     double ln;
  
     
     
     
     public void accept()
     {
         Scanner s = new Scanner (System.in);
         System.out.println("enter length ");
         ln=s.nextDouble();
         
         
     }

    @Override
    public String toString() {
        return "Length{" + "ln=" + ln + '}';
    }

//    @Override
//    public int hashCode() {
//        int hash = 5;
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
//        final Length other = (Length) obj;
//        if (Double.doubleToLongBits(this.ln) != Double.doubleToLongBits(other.ln)) {
//            return false;
//        }
//        return true;
//    }

    
     
}
