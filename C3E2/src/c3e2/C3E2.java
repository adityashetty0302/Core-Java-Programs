package c3e2;

import java.util.Scanner;

public class C3E2 
{
    public static void main(String[] args) 
    {
        int x,y;
        Scanner s=new Scanner (System.in);
        System.out.println("enter two numbers");
        x=s.nextInt();
        y=s.nextInt();
        add(x,y);
        add(5,5,10);
        add(2.5,7.5);
    }
    
    public static void add(int a, int b)
    {
        System.out.println(a+b);    
    }
    
    public static void add(int a, int b, int c)
    {
        System.out.println(a+b+c);    
    }
    
    public static void add(double a, double b)
    {
        System.out.println(a+b);
    }        
            
}
