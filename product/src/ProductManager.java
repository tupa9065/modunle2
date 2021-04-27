import java.io.*;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
     ArrayList<Product> products=new ArrayList<Product>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name");
        String name = scanner.nextLine();
        System.out.println("Brand");
        String brand = scanner.nextLine();
        System.out.println("Price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Detail");
        String detail = scanner.nextLine();
        Product product= new Product(name,brand,price,detail);
        products.add(product);
        System.out.println("add thanh cong san pham "+product.getName());

    }
    public Product searchByID(int id){
        for (Product p:products
             ) {
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }

    public void displayProducts() {
        for (Product p:products
             ) {
            System.out.println(p);
        }
    }
    public ArrayList<Product> readDataFromFile(String path){
        ArrayList<Product> newListProduct= new ArrayList<Product>();
        try {
            FileInputStream fis= new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            newListProduct = (ArrayList<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newListProduct;
    }
    public void writeToFile(String path){
        try {
            FileOutputStream fos= new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
