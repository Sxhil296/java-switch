import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();
//
//        switch (fruit) {
//            case "Mango":
//                System.out.println("king of fruits!");
//                break;
//            case "Apple":
//                System.out.println("Sweet red fruit.");
//                break;
//            case "Orange":
//                System.out.println("A citrus fruit.");
//                break;
//            default:
//                System.out.println("Enter a valid fruit name");
//        }

        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }
    }
}