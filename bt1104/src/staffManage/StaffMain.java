package staffManage;



import java.util.Scanner;

import static staffManage.Staff.lastID;

public class StaffMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StaffManager staffManager =new StaffManager();
        Staff[] staffs = new Staff[5];
        staffs[0] = new FullTime(1, "aa", 20, "123245", "@gmail", 0, 0, 3000000);
        lastID++;
        Staff.totalStaff++;
        FullTime.totalSFT++;
        staffs[1] = new FullTime(2, "aa", 20, "123245", "@gmail", 1000000, 0, 5000000);
        lastID++;
        Staff.totalStaff++;
        FullTime.totalSFT++;
        staffs[2] = new FullTime(3, "aa", 20, "123245", "@gmail", 0, 1000000, 7000000);
        lastID++;
        Staff.totalStaff++;
        FullTime.totalSFT++;
        staffs[3] = new PartTime(4, "aa", 20, "123245", "@gmail", 50);
        lastID++;
        Staff.totalStaff++;
        PartTime.totalSPT++;
        staffs[4] = new PartTime(5, "aa", 20, "123245", "@gmail", 60);
        lastID++;
        Staff.totalStaff++;
        PartTime.totalSPT++;


        int choice = -1;
        while (choice != 0) {
            System.out.println("1.hien thi danh sach ");
            System.out.println("2.them nhan vien Full time");
            System.out.println("3.them nhan vien Part time");
            System.out.println("4.hien thi danh sach nhan vien thu nhap thap ");
            System.out.println("5.tong tien luong phai tra cho nhan vien ban thoi gian ");
            System.out.println("0.thoat chuong trinh ");
            System.out.println("Lua chon cua ban ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    staffManager.display(staffs);
                    break;
                }
                case 2: {
                    Staff[] temp = staffs;
                    int i=0;
                    staffs = new Staff[temp.length+1];
                    for (Staff s:temp) {
                        staffs[i]=s;
                         i++;
                    }
                    staffs[staffs.length-1]=staffManager.addFullTime();
                    break;
                }
                case 3: {
                    Staff[] temp = staffs;
                    int i=0;
                    staffs = new Staff[temp.length+1];
                    for (Staff s:temp) {
                        staffs[i]=s;
                        i++;
                    }
                    staffs[staffs.length-1]=staffManager.addPartTime();
                    break;
                }
                case 4: {
                    staffManager.getLowIncome(staffs);
                    break;
                }
                case 5:{
                    int total = staffManager.getTotalSalaryPT(staffs);
                    System.out.println("total salary part time in company: "+total);
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("lua chon khong hop le");
                }
            }
        }
    }
}
