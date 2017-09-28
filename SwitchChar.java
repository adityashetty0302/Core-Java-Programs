import java.util.Scanner;

public class SwitchChar
{
public static void main(String[] args)
{
char c;
Scanner s = new Scanner(System.in);

System.out.println("Enter a character");
c=s.next().charAt(0);

switch(c)
{
case 'A':
case 'a':
System.out.println("Grade is A");
break;

case 'B':
case 'b':
System.out.println("Grade is B");
break;

default:
System.out.println("Invalid Input");
}
}
}
