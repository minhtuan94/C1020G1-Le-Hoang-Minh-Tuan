package _07_abstract_interface;

public class DungSiDepTrai extends DungSi {

    public DungSiDepTrai(String ten) {
        super(ten);
    }

    @Override
    public void nhiemVu(String nhiemVu) {
        System.out.println("Dung si [" + getTen() + "] dang lam nhiem vu: " + nhiemVu);
    }
}
