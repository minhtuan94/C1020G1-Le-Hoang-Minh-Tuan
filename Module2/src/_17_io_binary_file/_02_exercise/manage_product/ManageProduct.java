package _17_io_binary_file._02_exercise.manage_product;

import _17_io_binary_file_demo.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageProduct implements Serializable {
    static Scanner scanner = new Scanner(System.in);
    static List<InfoProduct> products = new ArrayList<>();

    public static void them() {
        System.out.println("Nhập mã số");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên sản phẩm");
        String names = scanner.nextLine();

        System.out.println("Nhập vào hãng sản xuất");
        String brand = scanner.nextLine();

        System.out.println("Nhập giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("other");
        String other = scanner.nextLine();

        products.add(new InfoProduct(id, names, brand, price, other));

    }

    public static void showInfoProduct() {
        readFile();
//        for (InfoProduct value : products) {
//            System.out.println(value);
//        }
    }

    public static void findInfoProduct() {
        System.out.println("Nhập tên sản phẩm cần tìm");
        scanner.nextLine();
        String newNames = scanner.nextLine();
        for (InfoProduct product : products) {
            if (newNames.equals(product.getNames())) {
                System.out.println(product);
            }
        }
    }

    public static void writeFile() {
        ManageProduct.them();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("src/_17_io_binary_file/_02_exercise/manage_product/product.csv", true)
            );

            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readFile() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("src/_17_io_binary_file/_02_exercise/manage_product/product.csv")
            );
            List<InfoProduct> product;
            do {
                product = (List<InfoProduct>) objectInputStream.readObject();
                System.out.println(product);
            } while (product != null);

        } catch (EOFException e) {
            System.out.println("Da het file roi");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
