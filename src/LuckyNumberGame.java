import java.util.Scanner;

public class LuckyNumberGame {
    public static void main(String[] args) {
        final int LUCKY_NUMBER = 7;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter number: ");
            int userNumber = scanner.nextInt();

            if(userNumber == LUCKY_NUMBER) {
                System.out.println("You win");
                break;
            }
            System.out.println("Try again");
        }

        System.out.println("Game Over !");
    }
}
