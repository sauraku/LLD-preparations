package utils;

import amazon.AmazonAppService;

import java.util.List;

public class Order {
    private List<Item> items;
    private float totalPrice = 0;
    private String userID;
    private OrderStatus status = OrderStatus.WaitingForPayment;

    public Order(List<Item> items, String userID) {
        this.items = items;
        this.userID = userID;
        for(Item item: items){
            this.totalPrice += item.getQuantity()* item.getProduct().getPrice();
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public float getTotalPrice() {
        return totalPrice;
    }


    public String getUserID() {
        return userID;
    }
    

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
        AmazonAppService.getInstance().notifySubscribers(this);
    }
}
