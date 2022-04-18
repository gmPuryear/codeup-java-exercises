package shapes;

class Square extends Quadrilateral {

    public Square(double length) {
        super(length, length);
    }


    @Override
    public double getPerimeter() {
        return  4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public void setlength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
//     // Properties
//
//
//     // Constructors
//
//     public Square(double side) {
//         super(side, side); //calling parent's constructor
//     }
//
//     // Custom Methods
//     @Override
//     double getArea() {
//         return 4 * this.length;
//     }
//     @Override
//     double getPerimeter() {
//         return this.length * this.length;
//     }






