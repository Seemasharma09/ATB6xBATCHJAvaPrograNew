package ex23042024;

import java.util.Scanner;

public class Largestnumber
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number a,b,c ");
        System.out.println("enter number a ");
        int a = sc.nextInt();
        System.out.println("enter number b ");
        int b = sc.nextInt();
        System.out.println("enter number c ");
        int c = sc.nextInt();

        if(a>b && a>c && c<b)
        {
            System.out.println("a is the largest number" + a);
        }
        else if (b>a && b>c && c<a)
        {
            System.out.println("b is the largest number" + b );
        }
        else if (c>a && c>b && b<a)
        {
            System.out.println("c is the largest number" + c );

        }
        sc.close();
    }

}

