import java.util.Scanner;
public class DistanceDemo
{
public static void main(String args[])
{

double d,u,t,a;
Scanner s=new Scanner(System.in);

System.out.println("enter u");
u=s.nextDouble();
System.out.println("enter a");
a=s.nextDouble();
System.out.println("enter t");
t=s.nextDouble();

d=u*t+(a*t*t)/2;

System.out.println("d is"+d);

	
}
}