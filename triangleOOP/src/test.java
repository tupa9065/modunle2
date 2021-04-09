import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập a");
        double a = sc.nextDouble();
        System.out.println("nhập b");
        double b = sc.nextDouble();
        System.out.println("nhập c");
        double c = sc.nextDouble();
        Triangle triangle = new Triangle(a,b,c);
        if(triangle.check3Side()){
            System.out.println(triangle);
        }else {
            System.out.printf("%.1f,%.1f,%.1f ko phải độ dài của cạnh tam giác",a,b,c);
        }
    }
}
