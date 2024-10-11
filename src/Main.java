import Controller.ProductController;
import Entity.Product;
import Service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        ProductController productController = new ProductController(productService);

        // Tạo sản phẩm
        Product product1 = new Product("MS123456", "ProductA", 100);
        Product product2 = new Product("NE654321", "ProductB", 200);
        Product product3 = new Product("SE123456", "Invalid Product", -50); // Số lượng không hợp lệ

        // Thêm sản phẩm
        productController.addProduct(product1);
        productController.addProduct(product2);
        productController.addProduct(product3);  // Lỗi vì số lượng không hợp lệ

        // Hiển thị danh sách sản phẩm
        productController.listProducts();

        // Cập nhật Sản phẩm
        product1.setQuantity(150);
        productController.updateProduct(product1);

        // Xóa Sản phẩm
        productController.deleteProduct("NE654321");
        productController.listProducts();
    }
}
