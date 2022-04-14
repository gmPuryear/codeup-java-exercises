package shapes;

public class Rectangle {
    // Properties
    private double length;
    private double width;

    // Constructors
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Custom Methods
    double getArea() {
        return this.length * this.width;
    }

    double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }


}
