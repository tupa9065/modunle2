package interfaceComparable;

import javafx.scene.shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(2.5);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }


        Arrays.sort(circles, new Comparator<Circle>() {
            @Override
            public int compare(Circle c1, Circle c2) {
                if (c1.getRadius() > c2.getRadius()) return -1;
                else if (c1.getRadius() < c2.getRadius()) return 1;
                else return 0;
            }
        });

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
