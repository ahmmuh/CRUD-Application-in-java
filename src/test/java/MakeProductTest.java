import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MakeProductTest {

    List<Product> products = Arrays.asList();

    @Test
  void getAllProducts() {
        MakeProduct makeProduct = new MakeProduct();
        assertArrayEquals(makeProduct.getAllProducts());

    }

    private void assertArrayEquals(List<Product> allProducts) {
    }


    @Test
    void addProduct() {
    MakeProduct makeProduct = new MakeProduct();
        Product product = new Product(1,"Äpple",LocalDateTime.now(),20);
        assertArrayEquals(makeProduct.addProduct());
        System.out.println(product);
    }

    private void assertArrayEquals(Product addProduct) {
    }
    @Test
    void getProduct(int id) {
       products.stream()
                .filter(product1 -> product1.getId() == id);
       assertArrayEquals(products.get(1));
    }

    @Test
    void uppdateProduct(int id) {
        List<Product> updateProduct = products.stream().filter(product -> product.getId() ==id)
                .collect(Collectors.toList());


        assertArrayEquals(products.get(id));
    }

    @Test
    void deleteProduct() {
        MakeProduct makeProduct = new MakeProduct();
        assertArrayEquals(makeProduct.deleteProduct(1));
    }
}