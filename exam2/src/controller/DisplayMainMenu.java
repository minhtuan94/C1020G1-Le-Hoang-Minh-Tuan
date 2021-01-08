package controller;

import common.ReadWriteFile;
import common.Validate;
import model.DienThoaiChinhHang;
import model.DienThoaiDiDong;
import model.DienThoaiXachTay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayMainMenu {
   static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu(){

        int choose;
        do {
            System.out.println("1.\t Thêm mới" +
                    "\n2.\t Xóa" +
                    "\n3.\t Xem danh sách điện thoại" +
                    "\n4.\t Tìm kiếm" +
                    "\n5.\t Thoát" +
                    "\n\t Chọn chức năng");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    themMoiDienThoaiDiDong();
                    break;
                case 2:
//                    xoaDienThoaiDiDong();
                    break;
                case 3:
                    xemDanhSachDienThoai();
                    break;
                case 4:
//                    timKiem();
                    break;
                default:
                    System.out.println("No choose");
                    break;
            }
        }while (choose!=5);

    }

    public static void themMoiDienThoaiDiDong() {
        int choose;
        System.out.println("1. Thêm mới Điện thoại chính hãng" +
                "\n2. Thêm mới điện thoại xách tay" +
                "\n Chọn chức năng");
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                themMoiDienThoaiChinhHang();
                break;
            case 2:
                themMoiDienThoaiXachTay();
                break;
            default:
                System.out.println("No choose");
                break;
        }

    }

    public static void themMoiDienThoaiChinhHang() {
        List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
        DienThoaiChinhHang dienThoaiChinhHang =new DienThoaiChinhHang(tenDienThoai(),giaBan(),soLuong(),nhaSanXuat(),
                thoiGianBaoHanh(),phamViBaoHanh());
        dienThoaiChinhHangList.add(dienThoaiChinhHang);
        ReadWriteFile.writeFileToDienThoaiChinhHang(dienThoaiChinhHangList,"src/data/mobiles.csv");
    }

    public static void themMoiDienThoaiXachTay() {
        List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(tenDienThoai(),giaBan(),soLuong(),nhaSanXuat(),
                quocGiaXachTay(),trangThai());
        dienThoaiXachTayList.add(dienThoaiXachTay);
        ReadWriteFile.writeFileToDienThoaiXachTay(dienThoaiXachTayList,"src/data/mobiles.csv");
    }

    public static String tenDienThoai() {
        System.out.println("Nhập tên điện thoại:");
        scanner.nextLine();
        String tenDienThoai = scanner.nextLine();
//        while (!tenDienThoai.matches(Validate.TEN_DT)) {
//            System.out.println("Tên điện thoại không hợp lệ, nhập lại");
//            tenDienThoai = scanner.nextLine();
//        }
        return tenDienThoai;
    }
    public static String giaBan() {
        System.out.println("Nhập giá bán");
        String giaBan = scanner.nextLine();
        while (!giaBan.matches(Validate.GIA_BAN)) {
            System.out.println("Giá bán không hợp lệ, nhập lại");
            giaBan = scanner.nextLine();
        }
        return giaBan;
    }
    public static String soLuong() {
        System.out.println("Nhập số lượng");
        String soLuong = scanner.nextLine();
        while (!soLuong.matches(Validate.GIA_BAN)) {
            System.out.println("Số lượng không hợp lệ, nhập lại");
            soLuong = scanner.nextLine();
        }
        return soLuong;
    }
    public static String nhaSanXuat() {
        System.out.println("Nhập nhà sản xuất");
        String nhaSanXuat = scanner.nextLine();
        return nhaSanXuat;
    }
    public static String thoiGianBaoHanh() {
        System.out.println("Nhập thời gian bảo hành");
        String thoiGianBaoHanh = scanner.nextLine();
        if (Integer.parseInt(thoiGianBaoHanh)>730 && Integer.parseInt(thoiGianBaoHanh)<0) {
            System.out.println("Thời gian bảo hành không hợp lệ, nhập lại");
            thoiGianBaoHanh = scanner.nextLine();
        }
        return thoiGianBaoHanh;
    }
    public static String phamViBaoHanh() {
        System.out.println("Nhập phạm vi bảo hành");
        String phamViBaoHanh = scanner.nextLine();
        while (!phamViBaoHanh.matches(Validate.PHAM_VI_BAO_HANH)) {
            System.out.println("Phạm vi bảo hành không hợp lệ, nhập lại");
            phamViBaoHanh = scanner.nextLine();
        }
        return phamViBaoHanh;
    }
    public static String quocGiaXachTay() {
        System.out.println("Nhập quốc gia xách tay");
        String quocGiaXachTay = scanner.nextLine();
        while (quocGiaXachTay.equals("Viet Nam")) {
            System.out.println("quốc gia xách tay không hợp lệ, nhập lại");
            quocGiaXachTay = scanner.nextLine();
        }
        return quocGiaXachTay;
    }
    public static String trangThai() {
        System.out.println("Nhập trạng thái");
        String trangThai = scanner.nextLine();
        while (!trangThai.matches(Validate.TRANG_THAI)) {
            System.out.println("Tên điện thoại không hợp lệ, nhập lại");
            trangThai = scanner.nextLine();
        }
        return trangThai;
    }
    
    public static void xemDanhSachDienThoai(){
        System.out.println(ReadWriteFile.readFile("src/data/mobiles.csv"));
    }
}
