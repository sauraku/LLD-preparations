package Subscribers;

import utils.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationSubject {
    Map<Order, List<Subscriber>> subscribers = new HashMap<>();

    public void notifyObservers(Order order){
        if(subscribers.get(order)!=null){
            for(Subscriber subscriber : subscribers.get(order)){
                subscriber.getNotified(order.getStatus().toString());
            }
        }
    }

    public void subscribe(Order order, Subscriber subscriber){
        if(subscribers.get(order)==null){
            subscribers.put(order, new ArrayList<>());
        }
        subscribers.get(order).add(subscriber);
    }
}
