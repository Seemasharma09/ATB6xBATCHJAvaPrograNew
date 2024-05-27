package ex23042024;

import java.util.Scanner;

public class Character_vowelorconsonant
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any Character");
        char ch = sc.next().charAt(0);
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u'||ch=='A' || ch=='E' ||ch=='I' ||ch=='O' || ch=='U')
        {
            System.out.println("character is vowel " + ch);

        }
        else
            System.out.println("Character is consonant " + ch);



    }
}
