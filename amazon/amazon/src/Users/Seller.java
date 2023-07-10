package Users;

import java.util.ArrayList;
import java.util.List;

import amazon.AmazonAppService;
import utils.Product;

public class Seller extends Buyer{
    
    private List<Product> itemsOnSale = new ArrayList<>();
    public Seller(String userID) {
        super(userID);
    }
    
    public void addProductForSale(Product product){
        itemsOnSale.add(product);
        AmazonAppService.getInstance().addProduct(product);
    }

    public void removeProductFromSale(Product product){
        // todo:
    }

    public void updateProductOnSale(Product product){
        // todo:
    }
    
    
}
