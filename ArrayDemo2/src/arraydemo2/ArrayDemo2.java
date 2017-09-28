
package arraydemo2;

import java.util.Scanner;


public class ArrayDemo2 
{

   
    public static void main(String[] args) 
    {
        Scanner s = new Scanner (System.in);
        String names[] = new String [5];
        
//        System.out.println("enter name");
//        names[0]=s.next();

        System.out.println("");
        
        System.out.println("enter 5 names");
        for(int i=0;i<=4;i++)
        {
            names[i]=s.next();
        }
        
//        for(String i:names)
//        {
//            names[i]=s.next();
//        }
System.out.println("");
        System.out.println("fe names");
        for (String n:names)
        {
            System.out.println(n);
        }
        System.out.println("");
        System.out.println("n names");
        for(int i=0;i<=4;i++)
        {
            System.out.println(names[i]);
        }
    }

}
