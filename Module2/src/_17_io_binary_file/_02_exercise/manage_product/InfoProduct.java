package _17_io_binary_file._02_exercise.manage_product;

import java.io.Serializable;

public class InfoProduct implements Serializable {
    private static final long serialVersionUID = 1L;

    public int id;
    public String names;
    public String brand;
    public double price;
    public String other;

    public InfoProduct(int id, String names, String brand, double price, String other) {
        this.id = id;
        this.names = names;
        this.brand = brand;
        this.price = price;
        this.other = other;
    }

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "InfoProduct{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", other='" + other + '\'' +
                '}';
    }
}
