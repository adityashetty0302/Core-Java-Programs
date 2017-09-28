package StudentDetails;

import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) 
    {
        Student s1=new Student();
        Scanner s= new Scanner (System.in);
        
        System.out.println("enter name ");
        s1.setName(s.next());
        System.out.println("enter id ");
        s1.setId(s.nextInt());
        System.out.println("enter sub ");
        s1.setSub(s.next());
        System.out.println("enter marks ");
        s1.setMarks(s.nextInt());
        
        System.out.println("name is "+s1.getName());
        System.out.println("id is "+s1.getId());
        System.out.println("sub is "+s1.getSub());
        System.out.println("marks is "+s1.getMarks());
        
        
        
    }
}
