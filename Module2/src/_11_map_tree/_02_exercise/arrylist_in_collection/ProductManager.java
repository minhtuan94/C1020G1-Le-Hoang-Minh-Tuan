package _11_map_tree._02_exercise.arrylist_in_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    static Product product = new Product(1, "Nokia", 900);
    static Product product1 = new Product(2, "Realme", 100);
    static Product product2 = new Product(3, "HTC", 930);
    static Product product3 = new Product(4, "Iphone", 903);

    private static Scanner scanner = new Scanner(System.in);

    static ArrayList<Product> products = new ArrayList<>();

    public static void show() {
        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        for (Product element : products) {
            System.out.println(element);
        }
    }
    public static void edit() {
        //sửa thông tin sản phẩm theo id
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã cần sửa");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {

                System.out.println("Nhập mã mới");
                int newID = scanner.nextInt();
                products.get(i).setId(newID);

                System.out.println("Nhập tên mới");
                scanner.nextLine();
                String names = scanner.nextLine();
                products.get(i).setNames(names);

                System.out.println("Nhập giá mới");
                double price = scanner.nextDouble();
                products.get(i).setPrice(price);
            }
//            System.out.println(products.get(i).getId());
        }
        for (Product element : products) {
            System.out.println(element);
        }
        System.out.println(products.size());
    }
    public static void remove(){
        //xóa thông tin sản phẩm
        System.out.println("Nhập mã cần xóa");
        int newID1 = scanner.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (newID1 == products.get(i).getId()) {
                products.remove(i);
            }
        }
        for (Product element : products) {
            System.out.println(element);
        }
    }
    public static void find(){
        //Tìm kiếm sản phẩm theo tên

        System.out.println("Nhập tên muốn tìm kiếm");
        scanner.nextLine();
        String newNames = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (newNames.equals(products.get(i).getNames())) {
                System.out.println(products.get(i));
            }
        }
    }
    public static void sort(){
        //sắp xếp sản phẩm
        Collections.sort(products, new ProductComparator());
        for (Product element : products) {
            System.out.println(element);
        }
    }
    public static void toAdd(){
        System.out.println("Nhập mã số");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String names = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        products.add(new Product(id,names,price));
        for (Product element : products) {
            System.out.println(element);
        }
    }
//    public static void setScanner(Scanner scanner) {
//        ProductManager.scanner = scanner;
//    }
}