import java.util.Scanner;

public class MethodsExercises {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        addition(9, 5);
        subtraction(10, 8);
        multiplication(20, 10);
        division(90, 10);
        modulus(100, 10);
        System.out.println(getInteger(1, 10));

//        System.out.println(calculateFactorial(1, 10));

        rollDice();

    }

    //    Inside of your class, write code to create the specified methods. Test your code by creating a main method and
//      calling each of the methods you've created.
//    1. Basic Arithmetic
//      a. Create four separate methods. Each will perform an arithmetic operation:
//          -Addition
//          -Subtraction
//          -Multiplication
//          -Division
//      b. Each function needs to take two parameters/arguments so that the operation can be performed
//      c. Test your methods and verify the output
//      d. Add a modulus method that finds the modulus of two numbers
//     Food for thought: What happens if we try to divide by zero? What should happen?
//
//     Bonus
//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
//        Do the above with recursion.

    public static int addition(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    public static int subtraction(int a, int b) {
        System.out.println(a - b);
        return a - b;
    }

    public static int multiplication(int a, int b) {
        System.out.println(a * b);
        return a * b;
    }

    public static double division(double a, double b) {
        System.out.println(a / b);
        return a / b;
    }

    public static int modulus(int a, int b) {
        System.out.println(a % b);
        return a % b;
    }


//    2. Create a method that validates that user input is in a certain range
//    The method signature should look like this:
//         Code: public static int getInteger(int min, int max);
//      and is used like this:
//         Code: System.out.print("Enter a number between 1 and 10: ");
//               int userInput = getInteger(1, 10);
//         If the input is invalid, prompt the user again.
//         Hint: recursion might be helpful here!
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between " + min + " and " + max + ":");
        int userInput = scanner.nextInt();
        if (userInput <= max && userInput >= min) {
            System.out.println("Right one");
        } else {
            System.out.println("Wrong number");
            return getInteger(min, max);
        }
        return userInput;
    }

    //
// 3. Calculate the factorial of a number.
//    -Prompt the user to enter an integer from 1 to 10.
//    -Display the factorial of the number entered by the user.
//    -Ask if the user wants to continue.
//    -Use a for loop to calculate the factorial.
//    -Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    -Use the long type to store the factorial.
//    -Continue only if the user agrees to.
//    -A factorial is a number multiplied by each of the numbers before it.
//    -Factorials are denoted by the exclamation point (n!). Ex:
    public static long calculateFactorial(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 10:");
        long factorial = 1;
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("Number not within range.");
            return calculateFactorial(1, 10);
        } else {
            for (int i = 1; i <= userInput; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }

    //    Create an application that simulates dice rolling.
//      -Ask the user to enter the number of sides for a pair of dice.
//      -Prompt the user to roll the dice.
//      -"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//      -Use static methods to implement the method(s) that generate the random numbers.
//      -Use the .random method of the java.lang.Math class to generate random numbers.
    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        boolean RollDice = true;
        do {
            System.out.println("Would you like to roll the dice? type y or n");
            String decision = scanner.next();
            if (decision.equalsIgnoreCase("y")) {
                System.out.println("How many total sides are on each dice?");
                int numberOfSides = scanner.nextInt();
                int diceOne = getNumber(numberOfSides);
                int diceTwo = getNumber(numberOfSides);
                System.out.printf("You rolled a %d and a %d \n", diceOne, diceTwo);
            } else {
                System.out.println("have a good day!");
                RollDice = false;
            }
        } while(RollDice);
    }

    public static int getNumber(int numSides) {
        int rolledNumber = (int) (Math.random() * numSides + 1);
        return rolledNumber;
    }


}
