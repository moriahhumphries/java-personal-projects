import java.util.Scanner;

public class PracticeMay2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int userNumber = scanner.nextInt();
//        System.out.println("You entered: \n" + userNumber);

        System.out.println("Enter a width: ");
        float userWidth = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter a length: ");
        float userLength = Float.parseFloat(scanner.nextLine());
        System.out.printf("Your width and length: %s %s", userWidth, userLength);

    }
}
