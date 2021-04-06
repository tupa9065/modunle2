import java.util.Scanner;

public class changeTemperature {
    static double changeCToF(double c){
        return (9.0 / 5) * c + 32;
    }
    static double changeFToC(double f){
        return (5.0 / 9) * (f - 32);
    }

    public static void main(String[] args) {
        boolean ck = true;
        while (ck){
            System.out.println("1. change C to F");
            System.out.println("2. change F to C");
            System.out.println("0. exit");
            Scanner sc = new Scanner(System.in);
            System.out.print("enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 0:{
                    ck=false;
                    break;
                }
                case 1:{
                    System.out.print("enter C:");
                    double c=sc.nextDouble();
                    double f =changeCToF(c);
                    System.out.printf("%.2f C to %.2f F \n",c,f);
                    break;
                }
                case 2:{
                    System.out.print("enter F:");
                    double f=sc.nextDouble();
                    double c= changeFToC(f);
                    System.out.printf("%.2f F to %.2f C \n",f,c);
                    break;
                }
                default:{
                    System.out.println("not found, please return your choice \n");
                }
            }
        }

    }
}
