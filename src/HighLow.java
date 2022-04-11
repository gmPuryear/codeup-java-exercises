import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HighLow {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        highLowGame(1, 100);
//        Game Development 101
//        Welcome to the world of game development!
//        You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//        The specs for the game are:
//          -Game picks a random number between 1 and 100.
//          -Prompts user to guess the number.
//          -All user inputs are validated.
//          -If user's guess is less than the number, it outputs "HIGHER".
//          -If user's guess is more than the number, it outputs "LOWER".
//          -If a user guesses the number, the game should declare "GOOD GUESS!"
//        Hints:
//          Use the random method of the java.lang.Math class to generate a random number.
//        Bonus:
//        -Keep track of how many guesses a user makes.
//        -Set an upper limit on the number of guesses.
    }

    public static void highLowGame(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int range = (max - min) + 1;
        int guessAttempts = 0;
        int guesslimits = 10;
        int randomNumber = (int) (Math.random() * range) + 1;
        do {
            System.out.println("Please guess the number that is between 1 and 100: ");
            int userGuess = scanner.nextInt();
            guessAttempts++;
            System.out.println(guessAttempts);
            if (userGuess == randomNumber) {
                System.out.println("Good Guess!");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Higher!");
            } else {
                System.out.println("lower");
            }
        } while (guessAttempts <= guesslimits);
        if (guessAttempts > 10) {
            System.out.println("sorry you didnt guess the number within 10 attempts");
        } else {
            System.out.println("You did it! The number was " + randomNumber + ". \nIt took you " + guessAttempts + " attempts.");
        }
    }
}
