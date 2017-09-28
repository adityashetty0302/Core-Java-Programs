package c2e13;

import java.util.Scanner;

public class C2E13 
{
    public static void main(String[] args) 
    {
       int f,s;
       Scanner c=new Scanner(System.in);
       System.out.println("enter 1st no.");
       f=c.nextInt();
       System.out.println("enter 2nd no.");
       s=c.nextInt();
       
       if(f%s==0)
       {
           System.out.println("f is divisible by s");
       }
       else
       {
           System.out.println("f is not divisible by s");
       }
       
       
    }
}
