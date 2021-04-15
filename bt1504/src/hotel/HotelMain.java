package hotel;

import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        ManageHotel manageHotel = new ManageHotel();
        Scanner sc = new Scanner(System.in);
        String cmt ;
        int choice = -1;
        do {
            System.out.println("1.display");
            System.out.println("2.add");
            System.out.println("3.delete by CMT");
            System.out.println("4.edit info by CMT");
            System.out.println("5.payment room change");
            System.out.println("0.exit");
            System.out.println("enter your choice");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    manageHotel.display();
                    break;
                case 2:
                    manageHotel.add();
                    break;
                case 3:
                    System.out.println("CMT");
                     cmt = sc.nextLine();
                    manageHotel.delete(cmt);
                    break;
                case 4:
                    System.out.println("CMT");
                     cmt = sc.nextLine();
                     manageHotel.edit(cmt);
                     break;
                case 5:
                    System.out.println("CMT");
                    cmt = sc.nextLine();
                    manageHotel.payment(cmt);
            }

        } while (choice != 0);
    }
}
