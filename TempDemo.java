import java.util.Scanner;
public class TempDemo
{
public static void main(String args[])
{

double c,f;
Scanner s=new Scanner(System.in);

System.out.println("enter c");
c=s.nextInt();

f=(c*9)/5+32;
System.out.println("f is "+f);
}
}