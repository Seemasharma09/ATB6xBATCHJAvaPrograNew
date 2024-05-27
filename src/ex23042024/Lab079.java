package ex23042024;

import java.util.Scanner;

public class Lab079
    //to check triangle is euuiletral (all side equal),
        // isosceles(two sides equal) or scalene(no side equal)
    //Ask user to enter three sides  for triangle,
        // if side1==side2==side3 triangle equilatral,if side1==side 2 and side 2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three sides of triangle to check triangle type ");
        int side1= sc.nextInt();
        int side2= sc.nextInt();
        int side3= sc.nextInt();
        if((side1==side2)&& (side2==side3)&&(side3==side1))
        {
            System.out.println("EQ triangle");
        }
        else if((side1==side2)||(side1==side3)||(side2==side3))
        {
            System.out.println("isosceles triangle");
        }
        else
        {
            System.out.println("scelene triangle");
        }
    sc.close();
    }


}
