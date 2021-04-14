import java.util.Scanner;

public class HotelMain {

    public static void main(String[] args) {
        HotelManager manager =new HotelManager();
        Scanner scanner = new Scanner(System.in);
        Hotel[] muongThanh = new Hotel[10];
        muongThanh[0]=new Hotel("Vip1",100,1);
        muongThanh[0].setRenter(new Person("Tuan","91","123"));
        muongThanh[1]=new Hotel("Vip2",200,1);
        muongThanh[1].setRenter(new Person("nam","91","234"));
        muongThanh[2]=new Hotel("Vip3",300,1);
        muongThanh[2].setRenter(new Person("Tuan","91","456"));
        muongThanh[3]=new Hotel("Normal",40,1);
        muongThanh[3].setRenter(new Person("Tuan","91","567"));
        muongThanh[4]=new Hotel("Couple",70,1);
        muongThanh[4].setRenter(new Person("Tuan","91","789"));
        for (int i = 5; i < 10; i++) {
            muongThanh[i]=new Hotel();
        }
        int choice=-1;
        while (choice!=0){
            System.out.println("1. hien thi thong tin khach tro");
            System.out.println("2. chinh sua thong tin khach tro theo cmt");
            System.out.println("3. xoa thong tin khach tro");
            System.out.println("4. tinh tien phong theo cmt");
            System.out.println("0. thoat");
            System.out.println("nhap lua chon cua ban");
            choice=scanner.nextInt();
            switch ((int) choice){
                case 1:{
                    manager.displayAllInformation(muongThanh);
                    break;
                }
                case 2:{
                    manager.editInformationByCMT(muongThanh);
                    break;
                }
                case 3:{
                    manager.deleteInformationByCMT(muongThanh);
                    break;
                }
                case 4:{
                    manager.payByCMT(muongThanh);
                    break;
                }
                case 0:{
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("lua chon khong hop le moi chon lai");
                }


            }


        }

    }
}
