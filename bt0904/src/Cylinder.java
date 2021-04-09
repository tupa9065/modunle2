public class Cylinder extends Cricle{
    private int height;

    public Cylinder(){

    }
    public Cylinder(int height) {
        this.height = height;
    }

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double vCylinder(){
        return height*getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height= '" + height +
                "' radius= '" + getRadius() +
                "' color= '" + getColor() +
                "' thể tích= '" + vCylinder() +
                "' }";
    }
}
