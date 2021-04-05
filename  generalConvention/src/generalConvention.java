import java.util.Scanner;

public class generalConvention {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ck = true;
        while (ck){
            System.out.println("enter a");
            int a = sc.nextInt();
            System.out.println("enter b");
            int b = sc.nextInt();
            a=Math.abs(a);
            b=Math.abs(b);
            if(a==0||b==0){
                System.out.println("No greatest common factor");
            }else {
                while (a!=b){
                    if(a>b){
                        a=a-b;
                    }else {
                        b=b-a;
                    }
                }
                System.out.println("greatest common factor is "+a);
            }
            System.out.println("press 1 to stop");
            int stop = sc.nextInt();
            if(stop==1){
                ck=false;
            }
        }

    }
}
