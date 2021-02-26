package com.example.service;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "iphone 5",300,"aaa"));
        products.put(2, new Product(2, "iphone 6",200,"bbb"));
        products.put(3, new Product(3, "iphone 7",400,"ccc"));
        products.put(4, new Product(4, "iphone 8",360,"ddd"));
        products.put(5, new Product(5, "iphone 9",320,"eee"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
    products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
