package _9_patterns._hw._strategy;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product("Milk", 5, 7);
        Product product2 = new Product("Water", 4, 5);
        Product product3 = new Product("Bread", 9, 12);
        Product product4 = new Product("Sweet", 3, 3);
        Product product5 = new Product("sweet", 4, 5);

        List<Product> products = Arrays.asList(product1, product2, product3, product4, product5);
        ProductService productService = new ProductService(products);

        System.out.println(productService.filter(new FilterByName("sw")));
        System.out.println(productService.filter(new FilterByPrice(10)));
    }
}
