package c4e3;

public class C4E3 
{
    public static void main(String[] args) 
    {
       
       Length l = new Length();
       Breadth b = new Breadth();
//       l=b;
       
       l.accept();
       b.accept();
       
        System.out.println(l);
        System.out.println(b);

       
       if(b.equals(l))
       {
           System.out.println("length and breadth are same");
       } 
       
       else 
       {
           System.out.println("length and breadth are different ");
       }
    }
}
