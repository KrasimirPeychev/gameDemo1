import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numGuesses = 0;
        boolean guessedCorrectly = false;

        // create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // loop until the player correctly guesses the number
        while (!guessedCorrectly) {
            // ask the player to guess the number
            System.out.print("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();
            numGuesses++;

            // check if the guess is too high or too low
            if (guess < numberToGuess) {
                System.out.println("Too low, try again!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again!");
            } else {
                // the player guessed correctly
                System.out.println("Congratulations, you guessed the number!");
                System.out.println("It took you " + numGuesses + " guesses.");
                guessedCorrectly = true;
            }
        }

        // close the Scanner object
        scanner.close();
    }
    }

