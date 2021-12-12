import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeProduct implements ProductRepo {

     List<Product> products =  Arrays.asList();
     List<Product> copyList  = new ArrayList<Product>(products);


    @Override
    public List<Product> getAllProducts() {
        List<Product> appointments  =  Arrays.asList();
        return copyList;
    }

    @Override
    public Product addProduct() {
        Product firstProduct = new Product(1,"Äpple",LocalDateTime.now(),20);
        copyList.add(firstProduct);
        return firstProduct;
    }

    @Override
    public Product getProduct(int id) {
        List<Product> product = copyList.stream().filter(product1 ->
                product1.getId() == id).collect(Collectors.toList());
        System.out.println("You got " + products.get(id));
        return product.get(id);
    }

    @Override
    public Product uppdateProduct(int id) {
        List<Product> updateProduct = copyList.stream().filter(product -> product.getId() ==id)
                .collect(Collectors.toList());
        return updateProduct.get(id);
    }

    @Override
    public Product deleteProduct(int id) {
        return null;
    }
}
