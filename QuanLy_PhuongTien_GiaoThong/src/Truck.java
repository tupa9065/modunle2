public class Truck extends Car{
    int grossTon;

    public Truck() {
    }

    public Truck(int trongTai) {
        this.grossTon = trongTai;
    }

    public Truck(String brand, int namSX, int price, String color, int trongTai) {
        super(brand, namSX, price, color);
        this.grossTon = trongTai;
    }

    public Truck(String brand, int namSX, int price, String color, String kieuDongCo, int soChoNgoi, int trongTai) {
        super(brand, namSX, price, color, kieuDongCo, soChoNgoi);
        this.grossTon = trongTai;
    }

    public Truck(String kieuDongCo, int soChoNgoi, int trongTai) {
        super(kieuDongCo, soChoNgoi);
        this.grossTon = trongTai;
    }

    public int getGrossTon() {
        return grossTon;
    }

    public void setGrossTon(int grossTon) {
        this.grossTon = grossTon;
    }

    @Override
    public String toString() {
        return "Truck {" +
                "engine type='" + engineType + '\'' +
                ", num of seats=" + numOfSeats +
                ", brand='" + brand + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", gross ton=" + grossTon +
                '}';
    }
    public void inputInfoTruck(int trongTai) {
        this.grossTon = trongTai;
    }
}
