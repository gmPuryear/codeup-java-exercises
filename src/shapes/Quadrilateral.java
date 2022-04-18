package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    // Properties
    protected double length;
    protected double width;

    // Constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Custom Methods
    public double getLength(double length) { // when called in main, main will have access to whatever length was set to by the setter
        return this.length;
    }
    public double getWidth(double width) {
        return this.width;
    }

    public abstract void setlength(double length); // abstract, so NO body input from main is taken in as parameter and sets the objects length.

    public abstract void setWidth(double width);




}
