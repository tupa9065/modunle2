import java.util.Scanner;
public class giaiPhuongTrinhB1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver \n Given a equation as 'a * x + b = 0', please enter constants: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("input a:");
        double a= sc.nextDouble();
        System.out.println("input b:");
        double b= sc.nextDouble();

        if (a!=0){
            double solution = -b/a;
            System.out.println("Solution: "+solution);
        }else {
            if(b==0){
                System.out.println("Solution is all x ");
            }else {
                System.out.println(("No solution"));
            }
        }
    }
}
