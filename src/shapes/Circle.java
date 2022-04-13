//Circle class
//Inside of src, create a package named shapes. Inside of shapes, create a class named Circle. This class should have a
//        private radius field that is set through the constructor, and various methods for getting information about the
//        circle, detailed below.
//public Circle(double radius)
//public double getArea()
//public double getCircumference()
//        Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your
//        Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to
//        import your Input class.)
//        The formulas for the circumference and area:
//        circumference = 2 x pi x radius
//        area = pi x (radius ^ 2)
//        For the value of pi, use the PI constant of the Math class.



package shapes;

public class Circle {

    // Properties
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Methods
    public double getArea() {
        double area = Math.PI * (this.radius * this.radius);
        return area;
    }

    public double getCircumference() {
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }

//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//    public double getArea() {
//        return Math.PI * (this.radius * this.radius);
//    }
//    public double getCircumference() {
//        return (2 * Math.PI * this.radius);
//    }

}
