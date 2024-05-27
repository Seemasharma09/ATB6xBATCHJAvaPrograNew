package ex23042024;

import java.util.Scanner;

public class Lab074
{
    public static void main(String[] args)
    {
        //Even and oodd number
        //Taking inpout from user  using scanner class
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your desired number");
        int num= sc.nextInt();
        if(num %2==0)
        {
            System.out.println("number is even " + num);
        }
        else
        {
            System.out.println("Number is odd "+ num);
        }
        sc.close();
    }
}
