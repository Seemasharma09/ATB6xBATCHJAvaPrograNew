package ex25042024;

import java.util.Scanner;

public class Lab082
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any character and we will tell you whether it is consonant or vowel");
        char input= sc.next().charAt(0);

        switch(input) {
            case 'a':
                System.out.println("user enterted a vowel");
                break;
            case 'e':
                System.out.println("user enterted a vowel");
                break;
            case 'i':
                System.out.println("user enterted a vowel");
                break;
            case 'o':
                System.out.println("user enterted a vowel");
                break;
            case 'u':
                System.out.println("user enterted a vowel");
                break;
            default:
                System.out.println("user entered a consonant");
        }
        sc.close();
    }
}

