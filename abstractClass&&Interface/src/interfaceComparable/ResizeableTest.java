package interfaceComparable;

public class ResizeableTest {
    public static void main(String[] args) {
        System.out.println("Cricle============================");
        Cricle cricle = new Cricle(10);
        System.out.println("truoc dung resize");
        System.out.println(cricle.getArea());
        System.out.println("sau dung resize");
        cricle.resize(100);
        System.out.println(cricle.getArea());

        System.out.println("Rectangle============================");
        Rectangle rectangle = new Rectangle(10,10);
        System.out.println("truoc dung resize");
        System.out.println(rectangle.getArea());
        System.out.println("sau dung resize");
        rectangle.resize(100);
        System.out.println(rectangle.getArea());

        System.out.println("Square============================");

        Square square = new Square(10);
        System.out.println("truoc dung resize");
        System.out.println(square.getArea());
        System.out.println("sau dung resize");
        square.resize(100);
        System.out.println(square.getArea());



    }
}
