
package Task2;

import java.io.*;

public class readOperation {

public static void main(String[] args)
{
try
{
FileInputStream fi = new FileInputStream("D:\\FilesDemo\\S180132.txt");
int i=0;// initializing a numeric variable
while((i=fi.read())!=-1)// fi object will read from the file and keep 
//storing every letter in i variable until the file reaches end EOF
{
System.out.print((char)i); 
}
// fi object was reading in byte stream
fi.close();

}
catch(IOException e)
{
System.out.println(e.getMessage());
e.printStackTrace();// print the message after tracing the exception in 
//stack memory

}


}

}