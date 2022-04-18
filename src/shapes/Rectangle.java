package shapes;

class Rectangle extends Quadrilateral implements Measurable {

    // Constructor
    public Rectangle (double length, double width) {
        super(length, width);
    }

    // Custom Methods
    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public void setlength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

//    double getPerimeter() {
//        return 2 * this.length + 2 * this.width;
//    }
//    double getArea();


//    // Properties
//    protected double length;
//    protected double width;
//
//    // Constructors
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    // Custom Methods
//    double getArea() {
//        return this.length * this.width;
//    }
//
//    double getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }
}
