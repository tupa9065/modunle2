public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 =shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 =shapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 =shapeFactory.getShape("rectangle");
        shape3.draw();

        Shape shape4 =shapeFactory.getShape("aa");
        shape4.draw();


    }
}
