package ex23042024;

import java.util.Scanner;

public class Leapyear
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any year");
     int yr= sc.nextInt();
     if (yr%4==0)
     {
         System.out.println("you have entered a leap year" + yr);

     }
     else
     {
         System.out.println("Entered year is not a leap year" + yr);
     }
        sc.close();
    }

}
