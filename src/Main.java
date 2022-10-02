import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit) {
            case "Mango":
                System.out.println("king of fruits!");
                break;
            case "Apple":
                System.out.println("Sweet red fruit.");
                break;
            case "Orange":
                System.out.println("A citrus fruit.");
                break;
            default:
                System.out.println("Enter a valid fruit name");
        }
    }
}