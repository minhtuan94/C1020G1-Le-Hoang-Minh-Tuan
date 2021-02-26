package com.example.service;

import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> productMap;

    static {

        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Iphone", "1233", "01/01/2004"));
        productMap.put(2, new Product(2, "Realme", "2215", "10/11/2012"));
        productMap.put(3, new Product(3, "Redme", "4544", "04/12/2001"));
        productMap.put(4, new Product(4, "Nokia", "5432", "02/04/2005"));
        productMap.put(5, new Product(5, "Lumia", "5544", "11/05/2014"));
        productMap.put(6, new Product(6, "Oppo", "3000", "12/08/2016"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product customer) {
        productMap.put(customer.getId(), customer);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }
}
