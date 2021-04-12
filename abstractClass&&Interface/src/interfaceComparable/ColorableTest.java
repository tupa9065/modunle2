package interfaceComparable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Square(10);
        shapes[1]=new Rectangle(10,20);
        shapes[2]=new Cricle(10);
        for (Shape shape:shapes) {

            if(shape instanceof Cricle){
                System.out.println(((Cricle) shape).getArea());
            }
            if(shape instanceof Rectangle ){
                if(shape instanceof Colorable){
                    System.out.println(((Square) shape).getArea());
                    ((Square) shape).howToColor();
                }else {
                    System.out.println(((Rectangle) shape).getArea());
                }
            }
        }

    }
}
