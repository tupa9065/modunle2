public class test {
    public static void main(String[] args) {
        Point p1 = new Point();
        // p1.setXY(5,5);
        //System.out.println(p1);
        Point p2 = new MovablePoint();
        p2.setXY(5, 5);
        //System.out.println(p2);

        MovablePoint p3 = new MovablePoint();
        p3.setXY(5, 5);
        p3.setSpeed(2, 2);
        System.out.println(p3);
        p3 = p3.move();
        System.out.println(p3);
    }
}
