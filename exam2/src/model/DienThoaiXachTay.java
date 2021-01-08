package model;

public class DienThoaiXachTay extends DienThoaiDiDong{
    private String quocGiaXachTay;
    private String trangThai;

    public DienThoaiXachTay( String tenDienThoai, String giaBan, String soluong, String nhaSanXuat,
                            String quocGiaXachTay, String trangThai) {
        super( tenDienThoai, giaBan, soluong, nhaSanXuat);
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
    public String toString() {
        return "DienThoaiXachTay{" +
                "quocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", trangThai='" + trangThai + '\'' +
                ", tenDienThoai='" + tenDienThoai + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", soluong='" + soLuong + '\'' +
                ", NhaSanXuat='" + NhaSanXuat + '\'' +
                '}';
    }

    @Override
    public int compareTo(DienThoaiDiDong o) {
        return 0;
    }
}
