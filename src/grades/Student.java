package grades;

import java.util.ArrayList;

public class Student {
    private String name;
//    --- Declare an arraylist with objects of type integer ---
    private ArrayList<Integer> grades = new ArrayList<>(); // creates a new empty array list for the object so you can add things to it

//    --- Constructor ---
    public Student(String name) {
        this.name = name;

    }
//    --- Custom Methods ---
    // returns the student's name
    public String getName() {
        return name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (Integer element : grades) {
//            System.out.println(element);
            sum += element;
        }
        double average = sum / grades.size();
        return average;
    }


    public static void main(String[] args) {
        Student student1 = new Student("Susie");
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(99);
        System.out.printf(student1.getName() + "'s average is: %.2f", student1.getGradeAverage());

        Student student2 = new Student("Hank");
        student2.addGrade(65);
        student2.addGrade(90);
        student2.addGrade(84);
        System.out.printf("\n" + student2.getName() + "'s average is: %.2f", student2.getGradeAverage());

        Student student3 = new Student("Brandon");
        student3.addGrade(55);
        student3.addGrade(80);
        student3.addGrade(74);
        System.out.printf("\n" + student3.getName() + "'s average is: %.2f",student3.getGradeAverage());





    }

    @Override
    public String toString() {
        return "Name: " +
                name +
                ", Grades: " +
                grades;
    }
}
