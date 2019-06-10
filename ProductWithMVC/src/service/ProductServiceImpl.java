package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Banh", 1200, "Ngot", "Bibica"));
        products.put(2, new Product(2, "Keo", 100, "Vi ca phe", "Bibica"));
        products.put(3, new Product(3, "Sua", 7000, "Khong duong", "Vinamilk"));
        products.put(4, new Product(4, "Nuoc ngot", 5000, "Huong dau", "Cocacola"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findByName(String name) {
        List<Product> list= new ArrayList<>(products.values());
        for(int i=0;i<list.size();i++){
            if(name.equals(list.get(i).getName())) return list.get(i);
        }
        return null;
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
