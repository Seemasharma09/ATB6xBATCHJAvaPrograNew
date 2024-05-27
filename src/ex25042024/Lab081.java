package ex25042024;

import java.util.Scanner;

// real example select to open a browser in automation project
public class Lab081
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter browser name");
        String browserName = sc.nextLine();
        browserName= browserName.toLowerCase();
        switch(browserName)
        {
            case "chrome":
                System.out.println("Staring the chrome browser");
                break;
            case "firefox":
                System.out.println("Starting Firefox browser");
                break;
            case"edge":
                System.out.println("Starting edge");
                break;
            default:
                System.out.println("Start IE explorer");


        }
        System.out.println("End of browser selection");
    }
}
