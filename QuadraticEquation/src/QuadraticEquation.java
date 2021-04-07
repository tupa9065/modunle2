public class QuadraticEquation {
    private int a,b,c;
    private double delta=Math.pow(this.b,2)-(4*a*c);
    QuadraticEquation(){
        a=1;
    }
    QuadraticEquation(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant(){
     return  delta;
    }
    public double getRoot1(){
        if(delta>=0){
            double root1=(b+Math.sqrt(delta))/(2*a);
            return root1;
        }else
            return 0;

    }public double getRoot2(){
        if(delta>=0){
            double root1=(-b+Math.sqrt(delta))/(2*a);
            return root1;
        }else
            return 0;
    }


}
