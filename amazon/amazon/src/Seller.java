import java.util.ArrayList;
import java.util.List;

public class Seller extends Buyer{
    
    private List<Product> itemsOnSale = new ArrayList<>();
    public Seller(String userID) {
        super(userID);
    }
    
    public void addProductForSale(Product product){
        itemsOnSale.add(product);
        //todo: AmazonAppService.getInstance().
    }
    
    
}
