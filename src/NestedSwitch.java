import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int empID = in.nextInt();
        String dep = in.next();

        switch (empID) {
            case 1:
                System.out.println("Sahil");
                break;
            case 2:
                System.out.println("Shoaib");
                break;
            case 3:
                switch (dep) {
                    case "IT":
                        System.out.println("IT Dep");
                        break;
                    case "Management":
                        System.out.println("Management Dep");
                        break;
                    default:
                        System.out.println("NO Dep");
                }
                break;
            default:
                System.out.println("enter valid id");
        }
    }
}
