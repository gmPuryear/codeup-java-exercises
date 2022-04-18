package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("The perimeter of the rectangle is " + box1.getPerimeter());
        System.out.println("The area of the rectangle is " + box1.getArea());
        Square box2 = new Square(5);
        System.out.println("The perimeter of the square is " + box2.getPerimeter());
        System.out.println("The area of the square is " + box2.getArea());

        System.out.println("--------------------------");
        Square square1 = new Square(9);
        System.out.println("The perimeter of the square is (using overridden method) " + square1.getPerimeter());
        System.out.println("The area of the square is (using overridden method) " + square1.getArea());

        System.out.println("--------------------------");
        Measurable measureSquare = new Square(8);
        System.out.println("The area of the square using Measurable interface is: "+ measureSquare.getArea());
        System.out.println("The perimeter of the square using Measurable interface is: " + measureSquare.getPerimeter());
        Measurable measureRectangle = new Rectangle(9, 4);
        System.out.println("The area of the rectangle using Measurable interface is: " + measureRectangle.getArea());
        System.out.println("The area of the rectangle using Measurable interface is: " + measureRectangle.getPerimeter());


    }
}
