package interfaceComparable;

public class Test {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
//
//        Cricle circle = new Cricle();
//        System.out.println(circle);
//
//        circle = new  Cricle(3.5);
//        System.out.println(circle);
//
//        circle = new  Cricle(3.5, "indigo", true);
//        System.out.println(circle);
//
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle("orange", true,2.5, 3.8 );
//        System.out.println(rectangle);
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square( "yellow", true,5.8);
        System.out.println(square);
    }
}
