public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(){}

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle( double sideA, double sideB, double sideC,String color, boolean filled) {
        super(color, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                '}';
    }
    public double getPerimeter() {
        return sideA+sideB+sideC;
    }
    public double getArea() {
        double p = this.getPerimeter()/2;
        double s = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        return s;
    }
    public boolean check3Side(){
        if(sideA+sideB>sideC&&sideB+sideC>sideA&&sideC+sideA>sideB){
            return true;
        }else return false;
    }
}
