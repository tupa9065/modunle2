import java.util.Scanner;

public class triangleEdge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ck = true;
        while (ck){
            System.out.println("enter a");
            int a = sc.nextInt();
            System.out.println("enter b");
            int b= sc.nextInt();
            System.out.println("enter c");
            int c = sc.nextInt();
            if(a+b>c&&a+c>b&&c+b>a){
                System.out.printf("a = %d, b= %d, c= %d is edge of triangle",a,b,c);
            }else {
                System.out.printf("a = %d, b= %d, c= %d is not edge of triangle ",a,b,c);
            }
            System.out.println("\n press 1 to stop program");
            int stop = sc.nextInt();
            if (stop==1){
                ck = false;
            }

        }

    }
}
