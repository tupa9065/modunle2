import java.util.Scanner;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else {
            System.out.println("nhap lai du lieu");
            Scanner scanner= new Scanner(System.in);
            shapeType= scanner.nextLine();
            return getShape(shapeType);
        }
    }
}
