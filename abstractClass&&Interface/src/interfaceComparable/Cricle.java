package interfaceComparable;

public class Cricle extends Shape{
    private double radius = 1;
    public Cricle(){
    }
    public Cricle(double radius){
        this.radius=radius;
    }

    public Cricle(double radius,String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "A Circle with radius="+radius+", which is a subclass of "+super.toString();
    }
}
