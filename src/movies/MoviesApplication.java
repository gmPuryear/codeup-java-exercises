package movies;

import util.Input; //------- Need to import the Input class IOT use the scanner for user input -------

public class MoviesApplication {
    public static void main(String[] args) {
        Input userInput = new Input();
        boolean wantsToExitProgram = true;

        do {
            System.out.println("What would you like to do?" +
                    "\n 0 - Exit" +
                    "\n 1 - View all movies" +
                    "\n 2 - View movies in the Animated category" +
                    "\n 3 - View movies in the Drama category" +
                    "\n 4 - View movies in the Horror category" +
                    "\n 5 - View movies in the Scifi category" +
                    "Please enter your selection: ");

//        ------- Importing the scanner object from the Input class and making an Input class object -------

            int userSelection = userInput.scanner.nextInt();
            System.out.println(userSelection);
            if (userSelection == 0) {
                wantsToExitProgram = false;
            } else {
                System.out.println();
            }
        } while (wantsToExitProgram);
    }
    public static void userOption(int selection) {
        if selectio
    }

}
