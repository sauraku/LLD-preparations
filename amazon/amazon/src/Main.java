import Subscribers.EmailNotificationSubscriber;
import Subscribers.SMSNotificationSubscriber;
import Subscribers.Subscriber;
import Users.Buyer;
import Users.Seller;
import amazon.*;
import utils.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("saurabh", "vaishali-3", "GZB", "IN", 201010, 9717212203L);
        Buyer saurabh = new Buyer("sauraku");
        Seller kumar = new Seller("kumar");
        saurabh.setAddresses(Arrays.asList(address));

        Product iphone = new Product("iphone", 100.0F,"iphone", ProductCategory.Electronics );
        kumar.addProductForSale(iphone);

        List<Product> products = AmazonAppService.getInstance().searchProductByName("iphone");
        System.out.println(products);

        products = AmazonAppService.getInstance().searchProductByCategory("Electronic");
        System.out.println(products);

        Item iphone_2 = new Item(iphone, 2);

        saurabh.addToCart(iphone_2);

        Order order = saurabh.createOrder();

        Subscriber emailSubscriber = new EmailNotificationSubscriber(saurabh);
        Subscriber smsSubscriber = new SMSNotificationSubscriber(saurabh);
        Subscriber emailSubscriber2 = new EmailNotificationSubscriber(kumar);
        AmazonAppService.getInstance().addSubscriber(order, emailSubscriber);
        AmazonAppService.getInstance().addSubscriber(order, smsSubscriber);
        AmazonAppService.getInstance().addSubscriber(order, emailSubscriber2);

        saurabh.checkout(order);


    }
}