package volumedemo;
import java.util.Scanner;
public class VolumeDemo 
{
    public static void main(String[] args) 
    {
     double v,pi,r,h;
    Scanner s=new Scanner(System.in);
    pi=3.14;

    System.out.println("enter r");
    r=s.nextInt();
    System.out.println("enter h");
    h=s.nextInt();

    v=pi*r*r*h;

    System.out.println("v is "+v);  
    }
}
