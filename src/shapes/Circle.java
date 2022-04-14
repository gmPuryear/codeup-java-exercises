package shapes;

public class Circle {

    // Properties
    private double radius;

    // Constructors
    public Circle(double radius) {
        this.radius = radius;
    }

    // Custom Methods
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }


}
