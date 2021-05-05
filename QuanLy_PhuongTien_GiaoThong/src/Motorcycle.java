public class Motorcycle extends Vehicle{
    int capacity;

    public Motorcycle() {
    }

    public Motorcycle(String brand, int namSX, int price, String color, int capacity) {
        super(brand, namSX, price, color);
        this.capacity = capacity;
    }

    public Motorcycle(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "capacity=" + capacity +
                ", brand='" + brand + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
    public void inputInfoMotorcycle(int capacity) {
        this.capacity = capacity;
    }
}
