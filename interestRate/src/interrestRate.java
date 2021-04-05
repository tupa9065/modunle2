import java.util.Scanner;

public class interrestRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter loan money");
        double money = sc.nextDouble();
        System.out.println("enter loan rate %/month");
        double rate = sc.nextDouble();
        System.out.println("enter loan month ");
        int month = sc.nextInt();
        double totalIR = money*rate*month/100;
        System.out.printf("interest money of %.0f apter %d is %.0f ",money,month,totalIR);


    }
}
