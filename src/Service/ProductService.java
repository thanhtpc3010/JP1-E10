package Service;
import Entity.Product;
import Igeneric.IGeneralService;
import Validation.ProductValidation;

import java.util.ArrayList;
import java.util.List;
import Exception.NotFoundProductIdException;
import Exception.InvalidProductNameException;

public class ProductService implements IGeneralService<Product> {
    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(String id) {
        try {
            return products.stream()
                    .filter(product -> product.getId().equals(id))
                    .findFirst()
                    .orElseThrow(() -> new NotFoundProductIdException("Không tìm thấy ID sản phẩm"));
        } catch (NotFoundProductIdException e) {
            System.out.println(e.getMessage());
            return null;  // Trả về null nếu không tìm thấy sản phẩm
        }
    }

    @Override
    public Product getByName(String name) {
        try {
            return products.stream()
                    .filter(product -> product.getName().equalsIgnoreCase(name))
                    .findFirst()
                    .orElseThrow(() -> new InvalidProductNameException("Không tìm thấy tên sản phẩm"));
        } catch (InvalidProductNameException e) {
            System.out.println(e.getMessage());
            return null;  // Trả về null nếu không tìm thấy sản phẩm
        }
    }

    @Override
    public void update(Product product) {
        try {
            Product existingProduct = getById(product.getId());
            if (existingProduct != null) {
                existingProduct.setQuantity(product.getQuantity());
                existingProduct.setName(product.getName());
            }
        } catch (Exception e) {
            System.out.println("Cập nhật sản phẩm thất bại: " + e.getMessage());
        }
    }

    @Override
    public void delete(String id) {
        try {
            Product product = getById(id);
            if (product != null) {
                products.remove(product);
            }
        } catch (Exception e) {
            System.out.println("Xóa sản phẩm thất bại: " + e.getMessage());
        }
    }

    public void addProduct(Product product) {
        try {
            ProductValidation.validateProduct(product);
            products.add(product);
        } catch (Exception e) {
            System.out.println("Thêm sản phẩm thất bại: " + e.getMessage());
        }
    }
}
