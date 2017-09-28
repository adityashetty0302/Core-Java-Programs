package c4e3withoutconstructorswith1class;

public class C4E3WithoutConstructorsWith1Class 
{
    public static void main(String[] args) 
    {
       Rectangle l=new Rectangle();
       Rectangle b=new Rectangle();
       
       System.out.println("Enter length");
       l.accept();
       System.out.println("Enter breadth");
       b.accept();
       
       if(l.equals(b))
       {
           System.out.println("both are same");
          
       }
       else
       {
           System.out.println("both are different");
       }
       
    }
}
