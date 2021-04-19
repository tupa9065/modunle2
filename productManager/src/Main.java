import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
       productManager.add5Product();

        Scanner scanner =new Scanner(System.in);
    int choice = -1;
        do {
            menu();
            System.out.println("nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1: {
                    productManager.addProduct();
                    productManager.displayProducts();
                    break;
                }
                case 2: {
                    System.out.println("nhập id của sản phẩm");
                    int id = scanner.nextInt();
                    System.out.println(productManager.searchProductByID(id));
                    Product editProduct = productManager.editProduct(id);
                    System.out.println(editProduct);
                    break;
                }
                case 3: {
                    System.out.println("nhập id của sản phẩm");
                    int id = scanner.nextInt();
                    productManager.deleteProduct(id);
                    productManager.displayProducts();
                    break;
                }
                case 4: {
                    productManager.displayProducts();
                    break;
                }
                case 5: {
                    System.out.println("nhập tên của sản phẩm");
                    String name = scanner.nextLine();
                    ArrayList<Product> newProduct = productManager.searchByName(name);
                    productManager.displayProducts(newProduct);
                    break;
                }
                case 6:{
                    productManager.displayProducts();
                    productManager.softByIDAscending();
                    break;
                }
                case 7:{
                    productManager.displayProducts();
                    productManager.softByIDDecrease();
                    break;
                }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("lựa chọn không hợp lệ");

            }
        }while (choice!=0);
    }

    private static void menu() {
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm theo id");
        System.out.println("3. Xoá sản phẩm theo id");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
        System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
    }
}
