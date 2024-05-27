package ex23042024;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int count=0;
        //int num=7;
        Scanner sc1 = new Scanner(System.in);
       System.out.println("Please enter any number");
        int num= sc1.nextInt();
         //after iteration  count =1
        for(int i=1;i<=num;i++)
        {
            if (num % i == 0)
            {
                count++ ;
            }
        }
            if(count==2)
            {
                System.out.println("prime");
            }
            else
            {

                System.out.println("not prime");
            }

    }

}
