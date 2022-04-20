package grades;

import util.Input;

import java.sql.SQLOutput;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        Input copier = new Input();
//        --- created empty HashMap ---
        HashMap<String, Student> usernames = new HashMap<>();

        Student student1 = new Student("Sue");
        student1.addGrade(75);
        student1.addGrade(99);
        student1.addGrade(80);
        usernames.put("SueP", student1);
        System.out.println(usernames.get("SueP"));

        Student student2 = new Student("Marvin");
        student2.addGrade(89);
        student2.addGrade(75);
        student2.addGrade(90);
        usernames.put("MarvinS", student2);
        System.out.println(usernames.get("MarvinS"));

        Student student3 = new Student("Gary");
        student3.addGrade(65);
        student3.addGrade(40);
        student3.addGrade(95);
        usernames.put("GaryG", student3);
        System.out.println(usernames.get("GaryG"));

        Student student4 = new Student("Laura");
        student4.addGrade(83);
        student4.addGrade(99);
        student4.addGrade(75);
        usernames.put("LauraA", student4);
        System.out.println(usernames.get("LauraA"));

        boolean keyDoesNotExist = true;
        System.out.println(printMenu(usernames));
//        System.out.println(
//                "-------------------------------------------------" +
//                        "\n" + "Greetings good sir/ma'am!" +
//                        "\n\n" + "Here are GitHub usernames: " +
//                        "\n" + usernames.keySet() +
//                        "\n\n" + "Enter a username to see user's grades: ");

        do {
            String userChoice = copier.getString();
//            System.out.println(userChoice);
            if (usernames.containsKey(userChoice)) {
                System.out.println(usernames.get(userChoice));
                break;
            } else {
                System.out.println("Sorry, that username does not exist! \nPlease enter a valid username: ");
                keyDoesNotExist = true;
            }
        } while (keyDoesNotExist);


    }
    public static String printMenu(HashMap usernames) {
        return
        "-------------------------------------------------" +
                "\n" + "Greetings good sir/ma'am!" +
                "\n\n" + "Here are GitHub usernames: " +
                "\n" + usernames.keySet() +
                "\n\n" + "Enter a username to see user's grades: ";
    }
}
