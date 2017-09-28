
package c4e3;


import java.util.Scanner;

public class Breadth 
{
    
     double br;
     
    
     
     
     
     public void accept()
     {
         Scanner s = new Scanner (System.in);
         System.out.println("enter breadth ");
         br=s.nextDouble();
         
     }

    @Override
    public String toString() {
        return "Breadth{" + "br=" + br + '}';
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
       
        final Length other = (Length) obj;
        if (this.br != other.ln) {
            return false;
        }
        return true;
    }

 

     
     
}
