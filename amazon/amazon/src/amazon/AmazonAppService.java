package amazon;

import Subscribers.NotificationSubject;
import Subscribers.Subscriber;
import Users.User;
import utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AmazonAppService {
    private static AmazonAppService app;
    private static NotificationSubject notificationSubject;
    private List<Product> products = new ArrayList<>();
    private AmazonAppService(){}
    
    public static AmazonAppService getInstance(){
        if(app == null){
            app = new AmazonAppService();
            notificationSubject = new NotificationSubject();
        }
        return app;
    }

    public Order createOrder(Cart cart, User user){
        Order order = new Order(cart.getItems(), user.getUserID());
        return order;
    }
    
    public void processOrder(Order order ){

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

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void notifySubscribers(Order order){
        notificationSubject.notifyObservers(order);
    }

    public void addSubscriber(Order order, Subscriber subscriber){
        notificationSubject.subscribe(order, subscriber);
    }
}
