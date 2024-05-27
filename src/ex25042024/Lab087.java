package ex25042024;

public class Lab087 {
    public static void main(String[] args) {
        int itemCode = 002;
        // JDK > 13

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");// adv of arrow sign is no need to use break stmt
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }
        char ch = 'a';
        switch (ch) {
            case 'a', 'e', 'i', 'u', 'o' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");

        }
    }
}