package bai_thi;

import java.util.Scanner;

public class DienThoaiXachTay extends DienThoai {
    private String quocGiaXachTay;
    private String trangThai;

    public DienThoaiXachTay() {
    }

    public DienThoaiXachTay(String quocGiaXachTay, String trangThai) {
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public DienThoaiXachTay(int id, String tenDienThoai, String giaBan, String soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap quoc gia xach tay");
        quocGiaXachTay = scanner.nextLine();
        Boolean check = false;
        do {
            String regex = "(^Da sua chua|Chua sua chua)+";
            System.out.println("nhap trang thai");
            trangThai = scanner.nextLine();
            check = trangThai.matches(regex);
            if (check == false) {
                System.out.println("trang thai la: Da sua chua|Chua sua chua ");
            }
        } while (!check);
    }

    @Override
    public String toString() {
        return super.toString() + "," + quocGiaXachTay + "," + trangThai;
    }
}
