import java.util.Scanner;

public class SwitchString
{
public static void main(String[] args)
{
String name;

Scanner s = new Scanner(System.in);

System.out.println("Enter your name");
name=s.next();

switch(name)
{
case "Aditya":
System.out.println("Welcome "+name);
break;

default:
System.out.println("Welcome unknown");
}
}
}