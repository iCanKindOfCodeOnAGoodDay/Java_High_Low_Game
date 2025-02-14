import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        System.out.println("Guess which number is higher");
        String guess = scanner.nextLine();
        System.out.println("Number 1 is " + number1 + " and number 2 is " + number2);
        System.out.println("Your guess is " + guess);
        if (Objects.equals(guess, "1")) {
            if (number1 > number2) {
                System.out.println("Win");
            }
            else if (number1 < number2) {
                System.out.println("Lose");
            } else {
                System.out.println("Draw");
            }
        } else if (Objects.equals(guess, "2")) {
            if (number1 < number2) {
                System.out.println("Win");
            } else if (number1 > number2) {
                System.out.println("Lose");
            } else {
                System.out.println("Draw");
            }
        } else {
            System.out.println("Please just input 1 or 2");
        }
        // now that the program is over, let's just do a recursive call to main to run it more
        main(null);
    }
}