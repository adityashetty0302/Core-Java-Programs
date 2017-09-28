
package traindemo;

import java.util.Scanner;

public class Reservation 
{
       String fullname, from, to, coach;
       int age;
       
       public void accept()
       {
           Scanner s = new Scanner(System.in);   
           System.out.println("Enter your full name: ");
           fullname = s.next();
           System.out.println("From: ");
           from = s.next();
           System.out.println("To: ");
           to = s.next();
           System.out.println("Coach: ");
           coach = s.next();
           System.out.println("Enter age: ");
           age = s.nextInt();
       }
       
       public void display()
       {
               System.out.println("-------Reservation Details----------");
               System.out.println("Passenger name is "+fullname);
               System.out.println("Journey From: "+from);
               System.out.println("Destination: "+to);
               System.out.println("Coach: "+coach);
               System.out.println("Age: "+age);
       }
       
}
