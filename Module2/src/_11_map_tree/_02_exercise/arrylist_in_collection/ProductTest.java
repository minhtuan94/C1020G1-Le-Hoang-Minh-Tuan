package _11_map_tree._02_exercise.arrylist_in_collection;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1. Hiển thị danh sách sản phẩm" +
                    "\n2. Sửa thông tin sản phẩm" +
                    "\n3. Xóa thông tin sản phẩm" +
                    "\n4. Tìm kiếm sản phẩm theo tên" +
                    "\n5. Sắp xếp sản phẩm tăng dần theo giá" +
                    "\n6. Thêm sản phẩm" +
                    "\n=========================================");
            System.out.println("Nhập vào lựa chọn");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    ProductManager.show();
                    break;
                case 2:
                    ProductManager.edit();
                    break;
                case 3:
                    ProductManager.remove();
                    break;
                case 4:
                    ProductManager.find();
                    break;
                case 5:
                    ProductManager.sort();
                    break;
                case 6:
                    ProductManager.toAdd();
                    break;
                default:
                    System.out.println("No choose");
            }
        } while (choose != -1);
    }
}