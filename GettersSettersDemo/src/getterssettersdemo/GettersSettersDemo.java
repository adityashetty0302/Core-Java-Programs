package getterssettersdemo;

import java.util.Scanner;

public class GettersSettersDemo 
{
    public static void main(String[] args) 
    {
//       Scanner s=new Scanner(System.in);
     
        Employee e1=new Employee();
        
        e1.setId(120);
        e1.setSal(2000);
        e1.setDept("Labour");
        e1.setDesg("Worker");
        
        System.out.println("employee id is "+e1.getId());
        System.out.println("employee salary is "+e1.getSal());
        System.out.println("employee dept is "+e1.getDept());
        System.out.println("employee desg is "+e1.getDesg());
        
        
        
       
    }
}
