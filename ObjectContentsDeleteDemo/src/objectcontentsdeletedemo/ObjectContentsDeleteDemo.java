package objectcontentsdeletedemo;

public class ObjectContentsDeleteDemo 
{
    public static void main(String[] args) 
    {
       Student d = new Student();
       d.define();
       d.display();
       
       Student f = new Student();
       f.define();
       f.display();
       
       d.display();
    }
}
