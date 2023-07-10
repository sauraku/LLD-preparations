package Users;

import utils.Address;
import amazon.AmazonAppService;
import utils.Order;
import utils.Product;

import java.util.ArrayList;
import java.util.List;

public class Buyer extends User {

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    List<Address> addresses = new ArrayList<>();
    public Buyer(String userID) {
        super(userID);
    }

    public Order createOrder(){
        return AmazonAppService.getInstance().createOrder(this.getCart(), this);
    }


    public void checkout(Order order){
        AmazonAppService.getInstance().processOrder(order);
    }

    public void comment(Product product){
        AmazonAppService.getInstance().handleComment("comment", product, this);
    }
    
}
