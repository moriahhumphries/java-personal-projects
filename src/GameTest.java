import java.util.Scanner;

public class GameTest {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (true) {
            gameContinues();
            System.out.println("Are you ready to begin?");
            String answer = scanner.nextLine();
            if (answer.toLowerCase().equals("yes")) {
                System.out.println("Your quest starts now.");
            } else {
                break;
            }
        }

    }

    public static void gameContinues(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String playerName = scanner.nextLine();
        System.out.println("Greetings, " + playerName);

    }

}
