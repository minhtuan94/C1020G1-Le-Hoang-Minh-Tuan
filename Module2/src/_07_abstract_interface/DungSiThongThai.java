package _07_abstract_interface;

public class DungSiThongThai extends _07_abstract_interface.DungSi implements _07_abstract_interface.IVuKhi, _07_abstract_interface.IGiap {
    public DungSiThongThai(String ten) {
        super(ten);
    }

    @Override
    public void nhiemVu(String nhiemVu) {
        System.out.println("Dung si [" + getTen() + "] dang lam nhiem vu: " + nhiemVu);
    }

    @Override
    public void getVuKi(String tenVuKhi) {
        System.out.println("Dung si ["+getTen()+"] duoc trang bi vu khi: "+tenVuKhi);
    }

    @Override
    public void getGiap(String tenGiap) {
        System.out.println("Dung si ["+getTen()+"] duoc trang bi giap: "+tenGiap);
    }
}
