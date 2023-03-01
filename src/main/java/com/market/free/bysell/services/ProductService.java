package com.market.free.bysell.services;


import com.market.free.bysell.models.Product;
import com.market.free.bysell.repositoryes.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public List<Product> listProducts(String title) {
        if (title != null )
            return productRepository.findByTitle(title);
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        log.info("Save new {}", product);
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null); // Optional найти товар в БД и если не найден вернуть null
    }
}
