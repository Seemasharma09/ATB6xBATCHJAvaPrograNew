package ex23042024;

import java.util.Scanner;

public class Lab077
{
    public static void main(String[] args)
    {
        // to calculate the grade of student>> Grade calculator
        //A:- 90-100
//        B:- 80-89
//        c:- 70- 79
//        d:- 60-69
//        f:- 0- 59
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student marks ");
        int marks= sc.nextInt();
        char grade ='F';
        if((marks>=90) && (marks<=100))
        {
            grade='A';
            //System.out.println("Congratulations you acheived grade  A" );
        }
    else if ((marks>=80) && (marks<=89))
        {
            grade = 'B';
            //System.out.println("Congratulations you acheived grade  B" );
        }
        else if ((marks>=70) && (marks<=79))
        {
            grade='C';
           // System.out.println("Congratulations you acheived grade  C" );
        }
        else if ((marks>=60) && (marks<=69))
        {
            grade='D';
            //System.out.println("Congratulations you acheived grade  D" );
        }
        else if (marks>100)
            System.out.println("lol you are great");
        else
        {
            grade='F';
            //System.out.println("Sorry you are fail with  grade  F" );
        }
        System.out.println("your grade is >>"+ grade );
        sc.close();
    }

}
