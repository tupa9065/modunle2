import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stop =0;
        while (stop==0) {
            System.out.println("enter the number");
            int num = sc.nextInt();
            boolean ck = true;
            if (num < 2) {
                ck = false;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    ck = false;
                    break;
                }
            }
            if (ck) {
                System.out.printf("%d is prime", num);
            } else {
                System.out.printf("%d is not prime", num);
            }
            System.out.println("\n press 1 to stop");
            int press= sc.nextInt();
            if(press==1){
                stop=1;
            }
        }
    }
}
