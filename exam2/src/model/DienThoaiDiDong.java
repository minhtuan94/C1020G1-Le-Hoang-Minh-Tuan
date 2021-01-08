package model;

public abstract class DienThoaiDiDong implements Comparable<DienThoaiDiDong>{

    public String tenDienThoai;
    public String giaBan;
    public String soLuong;
    public String NhaSanXuat;


    public DienThoaiDiDong(String tenDienThoai, String giaBan, String soluong, String nhaSanXuat) {

        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.soLuong = soluong;
        NhaSanXuat = nhaSanXuat;
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

    public String getSoluong() {
        return soLuong;
    }

    public void setSoluong(String soluong) {
        this.soLuong = soluong;
    }

    public String getNhaSanXuat() {
        return NhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        NhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "DienThoaiDiDong{" +
                ", tenDienThoai='" + tenDienThoai + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", soluong='" + soLuong + '\'' +
                ", NhaSanXuat='" + NhaSanXuat + '\'' +
                '}';
    }


}
