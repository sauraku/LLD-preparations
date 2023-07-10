package Subscribers;

import Users.User;

public class WhatsappNotificationSubscriber extends Subscriber{
    public WhatsappNotificationSubscriber(User user) {
        super(user);
    }

    @Override
    public void getNotified(String msg) {
        System.out.println("Whatsapp: " + msg);
    }
}
