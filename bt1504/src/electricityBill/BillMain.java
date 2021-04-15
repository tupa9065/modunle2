package electricityBill;

import java.util.Scanner;

public class BillMain {
    public static void main(String[] args) {
        BillManager billManager = new BillManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("amount of bill");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            billManager.addBill();
        }
        int choice = -1;
        do {
            System.out.println("1.display");
            System.out.println("2.add");
            System.out.println("3.e bill");
            System.out.println("0.exit");
            System.out.println("enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    billManager.displayBills();
                    break;
                case 2:
                    billManager.addBill();
                    break;
                case 3:
                    System.out.println("apaNumber");
                    String apa = scanner.nextLine();
                    System.out.println(billManager.payByApaNumber(apa));;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("illegal");
            }

        } while (choice != 0);
    }
}
