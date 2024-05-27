package ex23042024;
import java.util.Scanner;

public class Lab075
{
    public static void main(String[] args)
    {
        //find Max number of two
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1= sc.nextInt();
        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        int max= Math.max(num1,num2);
        System.out.println("max num by Math.max()_function is >>"+ max);
//        //if(num1>num2)
//        {
//            System.out.println("Max is >>"+ num1);
//        }
//        else
//        {
//            System.out.println("Max is >>"+ num2);
//        }
        sc.close();
    }
}
