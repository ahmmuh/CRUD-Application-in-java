public class Main {

    public static void main(String[] args) {
        ProductImpl makeProduct = new MakeProduct();
        System.out.println(makeProduct.getAllProducts());
        System.out.println(makeProduct.addProduct());
    }
}
