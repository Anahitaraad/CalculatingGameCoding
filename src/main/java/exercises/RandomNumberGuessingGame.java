package exercises;

import java.util.Random;
import java.util.Scanner;
 /* Write a program that first generates a random number between 1 and 500 and stores it into a variable (see the Random class).
  Then let the user make a guess for which number it is. If the user types the correct number,
  he should be presented with a message (including the number of guesses he has made).
   If he types a number that is greater or smaller than the given number,
    display either “Your guess was too small” or “Your guess was too big”.
     The program should keep executing until the user input the correct guess */

public class RandomNumberGuessingGame {
        public static void main(String[] args) {
            Random random = new Random();
            int randomNumber = random.nextInt(500) + 1;
            int guessCount = 0;
            boolean correctGuess = false;

            Scanner scanner = new Scanner(System.in);

            while (!correctGuess) {
                System.out.print("Make a guess (between 1 and 500): ");
                int guess = scanner.nextInt();
                guessCount++;

                if (guess == randomNumber) {
                    correctGuess = true;
                    System.out.println("Congratulations! You guessed the correct number.");
                    System.out.println("Number of guesses: " + guessCount);
                } else if (guess < randomNumber) {
                    System.out.println("Your guess was too small.");
                } else {
                    System.out.println("Your guess was too big.");
                }
            }
        }
    }

