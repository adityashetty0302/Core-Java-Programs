
package swhw;

import java.util.Scanner;

public class Common 
{
    private String authorname;
    private String title;
    private int price;
    private int pgno;
    Scanner s = new Scanner(System.in);
    
    public void accept()
    {
        System.out.println("Enter Author Name: ");
        authorname = s.next();
        System.out.println("Enter Title: ");
        title = s.next();
        System.out.println("Enter Price: ");
        price = s.nextInt();
        System.out.println("Enter Page Nos.: ");
        pgno = s.nextInt();
    }
    
    public void display()
    {
        System.out.println("Author Name is: "+authorname);
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Page Nos.: "+pgno);
    }
}
