package com.market.free.bysell.services;


import com.market.free.bysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long id = 0;

    {
        products.add(new Product(
                ++id,
                "PlayStation",
                "Gamer stars for you",
                67000,
                "Stavropol",
                "Andrey"));
        products.add(new Product(
                ++id,
                "iPhone 14 pro max",
                "For you a new smartphone",
                157999,
                "Moscow",
                "Abinari"));
    }

    public List<Product> listProducts() {
        return products;
    }

    public void saveProduct(Product product) {
        product.setId(++id);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id))
                return product;
        }
        return null;
    }
}
