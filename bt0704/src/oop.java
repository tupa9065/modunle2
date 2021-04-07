

public class oop {
    public static void main(String[] args) {
        rectangle rec1 = new rectangle();
        rec1.setWidth(10);
        rec1.setHeight(20);
        double area =rec1.getArea();
        double perimeter=rec1.getPerimeter();
        //System.out.println("area is "+area);
        //System.out.println("perimeter is "+perimeter);
        //rec1.display();
        rectangle rec2= new rectangle(4,6);
        double area2 =rec2.getArea();
        double perimeter2=rec2.getPerimeter();
//        System.out.println("area is "+area2);
//        System.out.println("perimeter is "+perimeter2);
//        rec2.display();
        System.out.println(rec1);
    }
}

