import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a:");
        int a= sc.nextInt();
        System.out.print("Enter b:");
        int b= sc.nextInt();
        System.out.print("Enter c:");
        int c= sc.nextInt();
        QuadraticEquation q1= new QuadraticEquation(a,b,c);
        double delta = q1.getDiscriminant();
        if(delta>0){
            double root1 = q1.getRoot1();
            double root2= q1.getRoot2();
            System.out.printf("Equation has 2 solutions is %.2f and %.2f",root1,root2);
        }else if(delta==0){
            double root= q1.getRoot1();
            System.out.printf("Equation has 2 solutions is %.2f and $.2f",root);
        }else {
            System.out.println("Equation has no solutions ");
        }
    }
}
