package Validation;

import Entity.Product;
import Exception.InvalidProductIdException;
import Exception.InvalidProductNameException;
import Exception.InvalidQuantityException;

public class ProductValidation {
    public static void validateProduct(Product product) throws InvalidProductIdException, InvalidProductNameException, InvalidQuantityException {
        try {
            // Validate Product ID
            if (!product.getId().matches("(MS|NE|SE)[0-9]{6}")) {
                throw new InvalidProductIdException("Định dạng ID sản phẩm không hợp lệ");
            }
        } catch (InvalidProductIdException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Validate Product Name
            if (!product.getName().matches("[a-zA-Z ]+")) {
                throw new InvalidProductNameException("Tên sản phẩm không hợp lệ");
            }
        } catch (InvalidProductNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Validate Product Quantity
            if (product.getQuantity() < 0) {
                throw new InvalidQuantityException("Số lượng phải là số nguyên dương");
            }
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
    }
}



