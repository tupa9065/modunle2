public class Car extends Vehicle {
    String engineType;
    int numOfSeats;

    public Car() {
    }

    public Car(String brand, int namSX, int price, String color) {
        super(brand, namSX, price, color);
    }

    public Car(String brand, int namSX, int price, String color, String kieuDongCo, int soChoNgoi) {
        super(brand, namSX, price, color);
        this.engineType = kieuDongCo;
        this.numOfSeats = soChoNgoi;
    }

    public Car(String kieuDongCo, int soChoNgoi) {
        this.engineType = kieuDongCo;
        this.numOfSeats = soChoNgoi;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine type='" + engineType + '\'' +
                ", num of seat=" + numOfSeats +
                ", brand='" + brand + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
    public void inputInfoCar(String kieuDongCo, int soChoNgoi) {
        this.engineType = kieuDongCo;
        this.numOfSeats = soChoNgoi;
    }
}
