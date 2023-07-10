import java.util.ArrayList;
import java.util.List;

public class Buyer extends User{
    
    List<Address> addresses = new ArrayList<>();
    public Buyer(String userID) {
        super(userID);
    }
    
    public void checkout(){
        AmazonAppService.getInstance().processOrder(getCart(), this);
    }

    public void comment(Product product){
        AmazonAppService.getInstance().handleComment("comment", product, this);
    }
    
}
