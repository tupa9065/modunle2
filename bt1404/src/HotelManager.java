import java.util.Scanner;

public class HotelManager {
    Scanner scanner = new Scanner(System.in);
    public void displayAllInformation(Hotel[] hotels){
        for (Hotel hotel : hotels){
            if(hotel.getDateOfHire()!=0){
                System.out.println(hotel.toString()+"\n");
            }

        }
    }
    public void editInformationByCMT(Hotel[] hotels){
        System.out.println("nhap cmt cua khach ban muon thay doi thong tin");
        String cmt = scanner.nextLine();
        int check=-1;
        for (Hotel hotel:hotels) {
            if (hotel.getRenter().getSoCMT().equals(cmt)){
                hotel.setInfomationOfRenter();
                System.out.println(hotel.toString());
                check=1;
                break;
            }
        }
        if (check==-1){
            System.out.println("khong co khach hang co cmt la: '"+cmt+"'");
            System.out.println("===========================================================================");

        }
    }
    public void deleteInformationByCMT(Hotel[] hotels){
        System.out.println("nhap cmt cua khach ban muon xoa thong tin");
        String cmt = scanner.nextLine();
        int check=-1;
        for (Hotel hotel:hotels) {
            if (hotel.getRenter().getSoCMT().equals(cmt)){
                hotel.deleteInfomationOfRenter();
                check=1;
                break;
            }
        }
        if (check==-1){
            System.out.println("khong co khach hang co cmt la: '"+cmt+"'");
            System.out.println("===========================================================================");

        }
    }
    public void payByCMT(Hotel[] hotels){
        System.out.println("nhap cmt cua khach ");
        String cmt = scanner.nextLine();
        int check=-1;
        for (Hotel hotel:hotels) {
            if (hotel.getRenter().getSoCMT().equals(cmt)){
                int hotelPrice=hotel.getPrice();
                System.out.println("Tien phong "+hotel.getKindOfRoom()+" trong "+hotel.getDateOfHire() +" ngay la :'"+hotelPrice+"' usd");
                System.out.println("===========================================================================");
                check=1;
                break;
            }
        }
        if (check==-1){
            System.out.println("khong co khach hang co cmt la: '"+cmt+"'");
            System.out.println("===========================================================================");

        }
    }
}
