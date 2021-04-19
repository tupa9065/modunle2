import java.util.Scanner;

public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public void inputInfoProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID");
        id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name");
        name=scanner.nextLine();
        System.out.println("price");
        price=scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public int compareTo(Product o) {
        if(this.price<o.price){
            return -1;
        }else if (this.price>o.price){
            return 1;
        }else {
            return 0;
        }
    }
}
