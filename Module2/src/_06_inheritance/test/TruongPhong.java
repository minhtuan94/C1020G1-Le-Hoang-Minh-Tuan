package _06_inheritance.test;

public class TruongPhong extends NhanVien {

    public double getThuNhap() {
        return 2;
    }

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new TruongPhong();
        TruongPhong nv3 = new TruongPhong();
        NhanVien[] nv4 = new NhanVien[5];
        nv4[0] = new TruongPhong();

        System.out.println(nv4.toString());
        System.out.println(nv2.getThuNhap()); //phương thức của lớp TruongPhong
        System.out.println(nv1.getThuNhap()); // phương thức của lớp Nhanvien
        System.out.println(nv3.getThuNhap()); //phương thức của lớp TruongPhong
        System.out.println(nv2.getThuNhap()); //phương thức của lớp TruongPhong
    }
}