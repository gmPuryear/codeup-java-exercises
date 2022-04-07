import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1. Loop Basics
//        a. While
//          -Create an integer variable i with a value of 5.
//          -Create a while loop that runs so long as i is less than or equal to 15
//          -Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        b. Do While
//          -Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with
//              a new line.
//          -Alter your loop to count backwards by 5's from 100 to -10.
//          -Create a do-while loop that starts at 2, and displays the number squared on each line while the number
//              is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536
//        For
//        Refactor the previous two exercises to use a for loop instead.

//        int num = 0;
//        do {
//            System.out.println(num);
//            num += 2;
//        } while(num <= 100);

//        int num = 100;
//        do {
//            System.out.println(num);
//            num -= 5;
//        } while(num >= -10);

//        long num = 2;
//        do {
//            System.out.println(num);
//            num *= num;
//        } while (num < 1000000);

//        Fizzbuzz
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//        Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//          -Write a program that prints the numbers from 1 to 100.
//          -For multiples of three: print “Fizz” instead of the number.
//          -For the multiples of five: print “Buzz”.
//          -For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        3. Display a table of powers.
//          -Prompt the user to enter an integer.
//          -Display a table of squares and cubes from 1 to the value entered.
//          -Ask if the user wants to continue.
//          -Assume that the user will enter valid data.
//          -Only continue if the user agrees to.

//        long square = 0;
//        long count = 1;
//        long cube = 0;
//
//        System.out.println("Please enter an integer");
//        int userInput =  scanner.nextInt();
//        long userInputLong = userInput;
//        boolean confirmation = true;
//        System.out.println("Number | Squared | Cubed");
//        do {
//            for (int i = 0; i < userInputLong; i++) {
//                square = count * count;
//                cube = count * count * count;
//                System.out.println(count + " | " + square + " | " + cube);
//                count++;
//            }
//            System.out.println("Would you like to continue?");
//            String continueYesNo = scanner.next();
//            String continueYesNoLowerCase = continueYesNo.toLowerCase();
//            System.out.println(continueYesNoLowerCase);
//            confirmation = continueYesNoLowerCase.equals("yes");
//        } while (confirmation);

//        Convert given number grades into letter grades.
//          -Prompt the user for a numerical grade from 0 to 100.
//          -Display the corresponding letter grade.
//          -Prompt the user to continue.
//          -Assume that the user will enter valid integers for the grades.
//          -The application should only continue if the user agrees to.
//        Grade Ranges:
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

//        boolean confirmation = true;
//        do {
//            System.out.println("Enter a grade");
//            int grade = scanner.nextInt();
//            if (grade <= 100 && grade >= 88) {
//                System.out.println("You got an 'A'");
//            } else if (grade <= 87 && grade >= 80) {
//                System.out.println("You got a 'B'");
//            } else if (grade <= 79 && grade >= 67) {
//                System.out.println("You got a 'C'");
//            } else if (grade <= 66 && grade >= 60) {
//                System.out.println("You got a 'D'");
//            } else {
//                System.out.println("You got an 'F'");
//            }
//            System.out.println("Would you like to continue?");
//            String continueYesNo = scanner.next();
//            String continueYesNoLowerCase = continueYesNo.toLowerCase();
//            System.out.println(continueYesNoLowerCase);
//            confirmation = continueYesNoLowerCase.equals("yes");
//        } while (confirmation);











    }
}
