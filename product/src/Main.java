import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        do{
            menu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    manager.addProduct();
                    break;
                case 2:
                    manager.displayProducts();
                    break;
                case 3:
                    System.out.println("id");
                    int id = Integer.parseInt(scanner.nextLine());
                    Product productSearch=manager.searchByID(id);
                    if(productSearch!=null){
                        System.out.println(productSearch);
                    }else {
                        System.out.println("no find product had id "+id);
                    }
                    break;
                case 4:{
                   // System.out.println("enter file south");
                    String path = "product.txt";
                    ArrayList<Product> newProducts= manager.readDataFromFile(path);
                    if (newProducts.isEmpty()){
                        System.out.println("no data");
                    }else {
                        manager.setProducts(newProducts);
                    }
                    break;}
                case 5:{
                    //System.out.println("enter file south");
                    String path = "product.txt";
                    manager.writeToFile(path);
                    break;}
            }
        }while (choice!=0);

    }

    private static void menu() {
        System.out.println("1.add product");
        System.out.println("2.display product list");
        System.out.println("3.search product by id");
        System.out.println("4.read data from file");
        System.out.println("5. write data to file");
        System.out.println("6. exit");
        System.out.println("your choice");
    }
}
