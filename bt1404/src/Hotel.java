import java.util.Scanner;

public class Hotel {
    Scanner scanner= new Scanner(System.in);
    private String kindOfRoom ="";
    private int price =0;
    private int dateOfHire =0;
    private Person renter = new Person();

    public Hotel() {
    }

    public Hotel(String loaiPhong, int giaPhong, int ngayThue) {
        this.kindOfRoom = loaiPhong;
        this.price = giaPhong;
        this.dateOfHire = ngayThue;
    }

    public Hotel(String loaiPhong, int giaPhong, int ngayThue, Person khachThue) {
        this.kindOfRoom = loaiPhong;
        this.price = giaPhong;
        this.dateOfHire = ngayThue;
        this.renter = khachThue;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(int dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public Person getRenter() {
        return renter;
    }

    public void setRenter(Person renter) {
        this.renter = renter;
    }
    public void setInfomationOfRenter(){
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        renter.setName(name);
        System.out.println("Nhap DOB");
        String dOB = scanner.nextLine();
        renter.setdOB(dOB);
        System.out.println("Nhap CMT");
        String cmt = scanner.nextLine();
        renter.setSoCMT(cmt);
        System.out.println("Nhap so ngay thue");
        setDateOfHire(scanner.nextInt());
    }
    public void deleteInfomationOfRenter(){
        renter.setName("name");
        renter.setdOB("dOB");
        renter.setSoCMT("cmt");
        setDateOfHire(0);
    }
    public int getRoomCharge(){
        return price * dateOfHire;
    }
    public String informationKhachThue(){
        return renter.toString();
    }
    @Override
    public String toString() {
        return "KhachSan{" +
                ", loaiPhong= '" + kindOfRoom +
                "', giaPhong= '" + price +
                "', ngayThue= '" + dateOfHire +
                "', khachThue= '" + renter.getName() +
                "' }";
    }
}
