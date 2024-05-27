package ex25042024;

public class Lab086
{
    public static void main(String[] args)
    {

        // JDK > 13-- run if java version is greater than 13
        int itemcode = 003;
        switch (itemcode)
        {
            case 001, 002, 003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004, 005, 007:
                System.out.println("It is Mechanical Gadget!");
                break;
            default:
                System.out.println("None");


        }
    }
}
