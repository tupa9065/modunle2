public class rectangle {
    private double height;
    private double width;
    rectangle(){}
    rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        double area = this.height*this.width;
        return area;
    }
    public double getPerimeter(){
        double perimeter = (this.height+this.width)*2;
        return perimeter;
    }
    public void display(){
        for (int i =0 ;i<this.width;i++){
            System.out.println();
            for (int j =0; j<this.height;j++){
                System.out.print("*");
            }
        }
    }
    @Override
    public String toString(){
        return "width: "+width+",height: "+height;
    }

}
