import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

// this is a basic high low guessing-game (in console) that tracks points & allows unlimited plays
// todo - create functions for win and lose
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        // game loop
        while (true) {
            Boolean gameOver = false;
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);
            System.out.println("Guess which number is higher");
            String guess = scanner.nextLine();
//          System.out.println("Number 1 is " + number1 + " and number 2 is " + number2);
            System.out.println("Your guess is " + guess);
            if (Objects.equals(guess, "1")) {
                if (number1 > number2) {
                    points++;
                    System.out.println("Win! You got " + points + " points now.");
                }
                else if (number1 < number2) {
                    System.out.println("Lose! You had " + points + " points.");
                    gameOver = true;
                } else {
                    System.out.println("Draw");
                }
            } else if (Objects.equals(guess, "2")) {
                if (number1 < number2) {
                    points++;
                    System.out.println("Win! You got " + points + " points now.");
                } else if (number1 > number2) {
                    System.out.println("Lose! You had " + points + " points.");
                    gameOver = true;
                } else {
                    System.out.println("Draw");
                }
            } else {
                System.out.println("Please just input 1 or 2\n");
            }
            // end game loop
            if (gameOver) {
                System.out.println("\n\nDo you want to play again?\n\n");
                main(null);
                break;
            }
        }


    }
}