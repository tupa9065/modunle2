package bai1;

import java.util.Scanner;

public class LibMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibManage libManage = new LibManage();

        String str ;
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. insert card");
            System.out.println("2. display all card");
            System.out.println("3. display card by cardID");
            System.out.println("4. display card by date of hire");
            System.out.println("0. exit");
            System.out.println("enter your choice:");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    libManage.insertLibCard();
                    break;
                case 2:
                    libManage.displayLibCardArr();
                    break;
                case 3:
                    System.out.println("cardID");
                    str = scanner.nextLine();
                    libManage.displayLibCard(str);
                    break;
                case 4:
                    System.out.println("hire");
                    str = scanner.nextLine();
                    libManage.displayStudent(str);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("not found");

            }
        }
    }
}
