package util;
import java.util.Scanner;

public class Input {

    // Properties
    private Scanner scanner;


    // Constructors
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    // Custom Methods


    // Getter for userInput
    public String getString() {
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }
    public boolean yesNo() {
        System.out.println("Enter yes or no");
        String whatever = this.scanner.nextLine();
        if (whatever.equalsIgnoreCase("yes") || whatever.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    // Gives option to just get a random integer that has no limits
    public int getIntRange() {
        return this.scanner.nextInt();
    }

    public int getIntRange(int min, int max) {
        System.out.println("Enter an integer between 1 and 10: ");
        int userNumber = this.scanner.nextInt();
            if (userNumber < min || userNumber > max) {
                return getIntRange(min, max);
            } else {
                System.out.println("That integer is within the range.");
                return userNumber;
            }
    }

    public double getDoubleRange() {
        return this.scanner.nextDouble();
    }

    public double getDoubleRange(double min, double max) {
        System.out.println("Please enter a decimal number between "+ min +" and "+ max + ":");
        double userDouble = this.scanner.nextDouble();
        if (userDouble < min || userDouble > max) {
            System.out.println("Double number not within range!");
            return getDoubleRange(min, max);
        } else {
            System.out.println("That number is within range!");
            return userDouble;
        }
    }

}
