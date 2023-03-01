package com.market.free.bysell.controllers;

import com.market.free.bysell.models.Product;
import com.market.free.bysell.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/")
    public String products(
            @RequestParam(name = "title",
                    required = false) String title,
            Model model) { // model передача данных в шаблонизатор
        model.addAttribute("products", productService.listProducts(title)); // ключ значение
        return "products";
    }

    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "product-info";
    }

    @PostMapping("/product/create")
    public String createProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/";
    }

    @PostMapping("product/delete/{id}")
    public String deleteProduct(@PathVariable Long id) { // аннотация связывает переменную из url страницы с переменной в функции (коде)
        productService.deleteProduct(id);
        return "redirect:/";
    }
}
