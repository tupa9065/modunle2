import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        quanLy.add5GiaoVien();
        System.out.println("them giao vien");
        quanLy.addGiaoVien();
        System.out.println("them can bo");
        quanLy.addCanBo();
        quanLy.displayAllInfo(quanLy.getCanBos());
        System.out.println("tim giao vien co luong lon hon");
        quanLy.findBySalary(new Scanner(System.in).nextInt());
    }
}
