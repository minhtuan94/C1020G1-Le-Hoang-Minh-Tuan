package bai_thi;

import java.util.Scanner;

public class DienThoaiChinhHang extends DienThoai {
    private String thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(String thoiGianBaoHanh, String phamViBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public DienThoaiChinhHang(int id, String tenDienThoai, String giaBan, String soLuong, String nhaSanXuat, String thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner input = new Scanner(System.in);
        boolean check = false;
        do {
            String regex = "[0-6]{1,3}";
            System.out.println("nhap thoi gian bao hanh");
            thoiGianBaoHanh = input.nextLine();
            check = thoiGianBaoHanh.matches(regex);
            if (check == false) {
                System.out.println("thoi gian khong qua 730 ngay");
            }

        } while (!check);
        check = false;
        do {
            String regex = "^(Toan Quoc|Quoc Te)$";
            System.out.println("nhap pham vi bao hanh");
            phamViBaoHanh = input.nextLine();
            check = phamViBaoHanh.matches(regex);
            if (check == false) {
                System.out.println("Toan Quoc|Quoc Te");
            }
        } while (!check);
    }

    @Override
    public String toString() {
        return super.toString() + "," + thoiGianBaoHanh + "," + phamViBaoHanh;
    }
}
