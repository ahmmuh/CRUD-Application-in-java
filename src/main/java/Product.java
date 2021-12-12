import java.time.LocalDateTime;

public class Product {
    private int id;
    private String productName;
    private LocalDateTime localDate;
    private int price;



    public Product(int id, String productName, LocalDateTime localDate, int price) {
        this.id = id;
        this.productName = productName;
        this.localDate = localDate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDateTime getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDateTime localDate) {
        this.localDate = localDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", localDate=" + localDate +
                ", price=" + price +
                '}';
    }
}
