package ex23042024;

import java.util.Scanner;

public class Lab076
{
    public static void main(String[] args)
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter  number");
        int num= sc1.nextInt();
        if(num>20)
        {
            System.out.println("num>20");
        }
        else if(num>10)
        {
            System.out.println(" number is between 10 and 20");
        }
        else
        {
            System.out.println("number is greater then 20");

        }
        sc1.close();
    }
}
