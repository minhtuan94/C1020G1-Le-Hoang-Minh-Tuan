package bai_thi;

import java.util.Scanner;

public abstract class DienThoai {
    private int id;
    private String tenDienThoai;
    private String giaBan;
    private String soLuong;
    private String nhaSanXuat;

    public DienThoai() {
    }

    public DienThoai(int id, String tenDienThoai, String giaBan, String soLuong, String nhaSanXuat) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return id + "," + tenDienThoai + "," + giaBan + "," + soLuong + "," + nhaSanXuat;
    }

    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ten dt");
        tenDienThoai = input.nextLine();
        boolean check = false;
        do {
            String regexGia = "^[1-9]{1,1}[0-9]*";
            System.out.println("nhap gia ban");
            giaBan = input.nextLine();
            check = giaBan.matches(regexGia);
        } while (!check);
        check = false;
        do {
            String regex = "^[1-9]{1,1}[0-9]*";

            System.out.println("nhap so luong");
            soLuong = input.nextLine();
            check = soLuong.matches(regex);
        } while (!check);
        System.out.println("nhap nha san xuat");
        nhaSanXuat = input.nextLine();
    }
}
