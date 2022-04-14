package shapes;

 class Square extends Rectangle {

     // Properties


     // Constructors

     public Square(double side) {
         super(side, side); //calling parent's constructor
     }

     // Custom Methods
     double getArea() {
         return 4 * this.length;
     }

     double getPerimeter() {
         return this.length * this.length;
     }





}
