package ex25042024;

import java.util.Scanner;
//Take a input from user, input1, input2 as int and ask the user what you want to do,
// enter char +,*,/ ,%, - , you will share the result by using the switch.
public class Program_switch
{
    public static void main(String[] args)
    {
       int result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter second number");
        int num2 = sc1.nextInt();
        System.out.println("What you want to do");
        char ch = sc.next().charAt(0);
        switch (ch)
        {
            case '*':
                result =num1*num2;
                System.out.println("The result is "+result);
                break;
            case '+':
                result  =num1+num2;
                System.out.println("The result is "+result);
                break;
            case '-' :
                result = num1-num2;
                System.out.println("The result is "+result);
                break;
            case '/' :
                result  =num1/num2;
                System.out.println("The result is "+result);
                break;
            case '%' :
                result  =num1%num2;
                System.out.println("The result is "+result);
                break;
            default:
                System.out.println("Invalid input");
        }
        sc.close();
        sc1.close();
    }
}
