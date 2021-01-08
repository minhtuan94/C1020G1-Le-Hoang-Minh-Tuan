package model;

public class DienThoaiChinhHang extends DienThoaiDiDong {
    private String thoiGianBaoHanh;
    private String phamViBaoHanh;


    public DienThoaiChinhHang(String tenDienThoai, String giaBan, String soluong, String nhaSanXuat, String thoiGianBaoHanh, String phamViBaoHanh) {
        super( tenDienThoai, giaBan, soluong, nhaSanXuat);
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
    public String toString() {
        return "DienThoaiChinhHang{" +
                "thoiGianBaoHanh='" + thoiGianBaoHanh + '\'' +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
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
