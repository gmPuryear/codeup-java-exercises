package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("The perimeter of the rectangle is " + box1.getPerimeter());
        System.out.println("The area of the rectangle is " + box1.getArea());
        Rectangle box2 = new Square(5);
        System.out.println("The perimeter of the square is " + box2.getPerimeter());
        System.out.println("The area of the square is " + box2.getArea());

        Square square1 = new Square(5);
        System.out.println("The perimeter of the square is (using overridden method) " + square1.getPerimeter());
        System.out.println("The area of the square is (using overridden method) " + square1.getArea());



    }
}
