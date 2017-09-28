package vowelsdemo;

import java.util.Scanner;

public class VowelsDemo 
{
    public static void main(String[] args) 
    {
        char c;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the character");
        c=s.next().charAt(0);
        
        switch(c)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            System.out.println("entered character is a vowel");
            break;
            
            default:
            System.out.println("entered character is a consonant");
        }
    }
}
