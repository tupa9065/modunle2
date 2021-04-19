import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();



    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

    public ProductManager() {
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    Scanner scanner = new Scanner(System.in);
    public void add5Product(){
        Product product1 = new Product(1, "1", 10);
        Product product2 = new Product(2, "2", 6);
        Product product3 = new Product(3, "3", 2);
        Product product4 = new Product(4, "4", 5);
        Product product5 = new Product(5, "5", 8);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
    }

    public void addProduct() {
        Product product = new Product();
        product.inputInfoProduct();
        products.add(product);
    }

    public Product searchProductByID(int id) {
        for (Product product : products
        ) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product deleteProduct(int id) {
        Product deleteProduct = searchProductByID(id);
        products.remove(deleteProduct);
        return deleteProduct;
    }

    public void softByIDAscending() {
        Collections.sort(products);
        displayProducts();
    }

    public void displayProducts() {
        System.out.println("===========products============");
        for (Product product : products
        ) {
            System.out.println(product);
        }
    }
    public void displayProducts(ArrayList<Product> newProducts) {
        System.out.println("===========products============");
        for (Product product : newProducts
        ) {
            System.out.println(product);
        }
    }

    public void softByIDDecrease() {
        Collections.sort(products);
        Collections.reverse(products);
        displayProducts();
    }

    public Product editProduct(int id) {
        Product editProduct = searchProductByID(id);
        for (Product p : products) {
            if (p.getId() == editProduct.getId()) {
                p.inputInfoProduct();
                return p;
            }
        }
        return null;
    }
    public ArrayList<Product> searchByName(String name){
        ArrayList<Product> newProduct = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().equals(name)) {
                newProduct.add(p);
            }
        }
        return newProduct;
    }


}
