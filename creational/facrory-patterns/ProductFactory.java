/**
 * @Author Abderrahmann C.
 * @Date 2025-08-02
 */
public class ProductFactory {

public static Product createProduct(String productType){
switch(productType.toLowerCase()){
    case "dummy": return new Dummy();
    case "cut": return new Cut();
    case "reel": return new Reel();
    default: return null;
}

}


}


