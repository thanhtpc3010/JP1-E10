package Controller;
import Entity.Product;
import Service.ProductService;

import java.util.List;

public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    public void listProducts() {
        List<Product> products = productService.getAll();
        products.forEach(System.out::println);
    }

    public void updateProduct(Product product) {
        productService.update(product);
    }

    public void deleteProduct(String id) {
        productService.delete(id);
    }
}

