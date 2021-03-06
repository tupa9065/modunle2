package interfaceComparable;

public class Square extends Rectangle implements Resizeable,Colorable{
    public Square() {}
    public Square(double side) {
        super(side,side);
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    public void resize(double percent) {
        double newSize = this.getSide()+this.getSide()*percent/100;
        this.setSide(newSize);

    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
