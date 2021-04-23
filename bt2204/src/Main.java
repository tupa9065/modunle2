import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        quanLy.add5TaiLieu();
        Scanner scanner=new Scanner(System.in);
        int choice = -1;
        do{
            System.out.println("1. hien thi");
            System.out.println("2. add sach");
            System.out.println("3. add tap chi");
            System.out.println("4. add bao");
            System.out.println("5. sap xep theo id");
            System.out.println("6. sap xep theo NXB");
            System.out.println("7. tim kiem theo id");
            System.out.println("0. exit");
            System.out.println("nhap lua chon");
            choice= scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    quanLy.showTailieus(quanLy.getTaiLieus());
                    break;
                case 2:
                    quanLy.addSach();
                    break;
                case 3:
                    quanLy.addTapChi();
                    break;
                case 4:
                    quanLy.addBao();
                    break;
                case 5:
                    quanLy.showTailieus(quanLy.softByID(quanLy.getTaiLieus()));
                    break;
                case 6:
                    quanLy.showTailieus(quanLy.softByNXB(quanLy.getTaiLieus()));
                    break;
                case 7:
                    quanLy.setTaiLieus(quanLy.softByID(quanLy.getTaiLieus()));
                    System.out.println("nhap id muon tim");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    int newId=quanLy.searchByID(id, quanLy.getTaiLieus());
                    if(newId==-1){
                        System.out.println("khong tim thay ma id "+id);
                    }else {
                        System.out.println(quanLy.getTaiLieus().get(newId));
                    }
                    break;
                case 0:
                    System.exit(0);

            }

        }while (choice!=0);
    }
}
