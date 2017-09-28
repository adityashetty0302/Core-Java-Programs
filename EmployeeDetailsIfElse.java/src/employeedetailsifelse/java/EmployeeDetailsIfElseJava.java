package employeedetailsifelse.java;
import java.util.Scanner;
public class EmployeeDetailsIfElseJava 
{
    public static void enterData()
{System.out.println("enterData method is invoked");}
public static void displayData()
{System.out.println("displayData method is invoked");}
public static void exit()
{System.out.println("exit is invoked");}
    public static void main(String[] args) 
    {
     int c;

Scanner s=new Scanner(System.in);

System.out.println("-----------Menu---------");
System.out.println("1. Enter Data");
System.out.println("2. display data");
System.out.println("3. exit");
System.out.println("choose an option:");
c=s.nextInt();

if(c==1)
{
enterData();
}
else if(c==2)
{
displayData();
}
else
{
exit();
}  
    }
}
