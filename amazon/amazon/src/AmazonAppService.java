import java.util.List;
import java.util.stream.Collectors;

public class AmazonAppService {
    private static AmazonAppService app;
    private List<Product> products;
    private AmazonAppService(){}
    
    public static AmazonAppService getInstance(){
        if(app == null){
            app = new AmazonAppService();
        }
        return app;
    }
    
    
    public void processOrder(Cart cart, User user ){
        Order order = new Order(cart.getItems(), user.getUserID());
        order.setStatus(OrderStatus.PaymentReceived);
        order.setStatus(OrderStatus.OrderConfirmed);
        order.setStatus(OrderStatus.InTransit);
        order.setStatus(OrderStatus.OutForDelivery);
        order.setStatus(OrderStatus.Delivered);
    }
    
    public List<Product> searchProductByName(String queryString){
        return products.stream().filter(product -> {
            if(product.getName().contains(queryString)){
                return true;
            }
            return false;
        }).collect(Collectors.toList());
    }

    public List<Product> searchProductByCategory(String queryString){
        return products.stream().filter(product -> {
            if(product.getCategory().name().contains(queryString)){
                return true;
            }
            return false;
        }).collect(Collectors.toList());
    }
    
    public void handleComment(String comment, Product product, User user){
        Comment comment1 = new Comment(user.getUserID(), comment);
        product.getComments().add(comment1);
    }
}
