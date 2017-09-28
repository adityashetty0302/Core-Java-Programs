package equalsdemo;

public class EqualsDemo 
{
    public static void main(String[] args) 
    {
       Student s1 = new Student(254,"aditya","java");
       Student s2 = new Student(254,"aditya","java");
       
//       s1=s2;

       if(s1.equals(s2))
       {
           System.out.println("both are equal");
       }
       else
       {
           System.out.println("not equal");
       }
       
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
       
       
       if(s1==s2)
       {
           System.out.println("both are equal");
       }
       else
       {
           System.out.println("not equal");
       }
       
       
    }
}
