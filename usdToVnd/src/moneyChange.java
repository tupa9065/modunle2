import java.util.Scanner;

public class moneyChange {
    public static void main(String[] args) {
        int rate =23000;
        System.out.println("enter your money need to be exchange");
        Scanner sc= new Scanner(System.in);
        int usd=sc.nextInt();
        int vnd = usd*rate;
        System.out.printf("%d usd can be exchange %d vnd",usd,vnd);
    }
}
