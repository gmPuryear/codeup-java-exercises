import java.util.Scanner;
public class ConsoleExercises {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.%n", name); //% HAS to be a string

//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, name);


//        1.
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is: %.2f. %n", pi); // uses '%s' as the placeholder and signifies strings. %n
//                                                                 tells it to make a new line after printing
        //Explore Scanner Class Exercises

        // 1. Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
            //What happens if you input something that is not an integer?
//        System.out.println("Enter an integer: ");
//        int userInt = scanner.nextInt();
//        System.out.printf("You entered the number %d.%n", userInt);

        // 2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
            //What happens if you enter less than 3 words?
            //What happens if you enter more than 3 words?
//        System.out.println("Please enter 3 words.");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("the first word is %s.%n Second word is %s.%nThird word is %s.%n", firstWord, secondWord, thirdWord);

        // 3.Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in
            // the console, each on a newline.
//        System.out.println("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.println(sentence);

        // Calculate the perimeter and area of Codeup's classrooms.

        // 1. Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
        //Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the
        // user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.
//        System.out.println("Please enter the length: ");
//        int length = scanner.nextInt();
//
//        System.out.println("Please enter the width: ");
//        int width = scanner.nextInt();
//
//        System.out.println("You entered length: " + length + " and width: " + width);
//
//        System.out.println("The perimeter of the codeup classroom is: " + length * width);

        //Bonus: In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in
        // addition to the area and perimeter.
        // The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input
        // with the useDelimiter method. Add the following line of code to your application after you have created a
        // scanner (assuming the variable holding the Scanner is named scanner):
        // scanner.useDelimiter("\n");
        //How does this change the way your program operates?
        //
        //Rewrite your classroom program to use nextInt method. If you added the line of code above to your application,
        // you should now have no trouble handling multiple pieces of user input.

        System.out.println("Enter a length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter a double width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter a double height: ");
        double height = scanner.nextDouble();
        double volume = length * width * height;
        double perimeter = ((2 * length) + (2 * width));
        double area = length * width;
        System.out.println("The perimeter of the room is " + perimeter + ".");
        System.out.println("The area of the room is: " + area + "sqft.");
        System.out.println("The volume of the room is: " + volume +" cubic feet.");

        // Johnny's method
//        System.out.println("Please enter a Width and Length, first width then length:");
//        int userWidthInput = Integer.parseInt(scanner.nextLine());
//
//        int userLengthInput = Integer.parseInt(scanner.next());
//
//        int userArea = userLengthInput * userWidthInput;
//
//        int userPeri = (userLengthInput * 2) + (userWidthInput * 2);
//
//        System.out.printf("The area is: " + userArea + ".%n");
//        System.out.printf("The perimeter is: " + userPeri + ".%n");











    }
}
