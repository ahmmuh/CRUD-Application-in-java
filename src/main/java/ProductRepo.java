import java.util.List;

public interface ProductRepo {
    public List<Product> getAllProducts();
    public Product addProduct();
    public Product getProduct(int id);
    public Product uppdateProduct(int id);
    public Product deleteProduct(int id);

}
