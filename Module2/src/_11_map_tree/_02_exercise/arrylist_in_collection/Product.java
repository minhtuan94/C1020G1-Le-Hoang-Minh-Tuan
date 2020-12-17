package _11_map_tree._02_exercise.arrylist_in_collection;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    public int id;
    public String names;
    public double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(int id, String names, double price) {
        this.id = id;
        this.names = names;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sản phẩm có mã là: "+getId()+",có tên là: "+getNames()+",có giá là: "+getPrice();
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
