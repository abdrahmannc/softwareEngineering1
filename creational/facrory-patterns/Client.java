/**
 * @Author Abderrahmann C.
 * @Date 2025-08-02
 */
public class Client {
    
    public static void main(String[] args) {
        Product product=ProductFactory.createProduct("Cut");
    
        product.operation();
    }
}
