package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
//        do
        System.out.println("Please enter a radius: ");
        double radius = input.getDoubleRange();
        System.out.println(radius);
        Circle circle = new Circle(radius);
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The perimeter of the circle is: " + circle.getCircumference());
//        while (input.yesNo());
    }

}
