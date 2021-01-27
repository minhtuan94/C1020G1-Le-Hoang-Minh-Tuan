package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Thinh", "thinh@codegym.vn", "Hanoi"));
        products.put(2, new Product(2, "Phuc", "phuc@codegym.vn", "Danang"));
        products.put(3, new Product(3, "Dung", "dung@codegym.vn", "Saigon"));
        products.put(4, new Product(4, "Phuoc", "phuoc@codegym.vn", "Beijin"));
        products.put(5, new Product(5, "Cao", "cao@codegym.vn", "Miami"));
        products.put(6, new Product(6, "Kien", "kien@codegym.vn", "Newyork"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product Product) {
        products.put(Product.getId(), Product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product Product) {
        products.put(id, Product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
