package c4e1;

import java.util.Scanner;

public class C4E1 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        int i;
        String n;
        String ds;
        String dp;
        
        
        System.out.println("enter id ");
        i=s.nextInt();
        System.out.println("enter name ");
        n=s.next();
        System.out.println("enter des ");
        ds=s.next();
        System.out.println("enter dept ");
        dp=s.next();
        
       
        Employee e = new Employee(i, n, ds, dp);
        
        
        System.out.println(e);
        System.out.println(e.toString());
    }
}
    