import java.io.Serializable;

public class Vehicle implements Serializable {
    String brand;
    int yearOfManufacture;
    int price;
    String color;

    public Vehicle(String brand, int namSX, int price, String color) {
        this.brand = brand;
        this.yearOfManufacture = namSX;
        this.price = price;
        this.color = color;
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                ", brand='" + brand + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
    public void inputInfoVehicle(String brand, int namSX, int price, String color){
        this.brand=brand;
        this.yearOfManufacture =namSX;
        this.price=price;
        this.color=color;
    }
}
