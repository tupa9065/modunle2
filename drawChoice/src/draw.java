import java.util.Scanner;

public class draw {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Draw triangle");
        System.out.println("2. draw square");
        System.out.println("3. draw rectangle");
        System.out.println("0. exit");
        System.out.println("enter your choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1: {
                    System.out.println("1. Draw triangle");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                }
                case 2: {
                    System.out.println("2. draw square");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;
                }
                case 3: {
                    System.out.println("3. draw rectangle");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("no choice");
                }

            }
            System.out.println("press 0 to stop program");
            int stop = sc.nextInt();
            if (stop == 0) {
                choice = 0;
            }
        }

    }
}
