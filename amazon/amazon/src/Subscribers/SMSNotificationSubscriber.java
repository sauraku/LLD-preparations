package Subscribers;

import Users.User;

public class SMSNotificationSubscriber extends Subscriber{
    public SMSNotificationSubscriber(User user) {
        super(user);
    }

    @Override
    public void getNotified(String msg) {
        System.out.println("SMS to "+ user.getUserID() +" : "  + msg);
    }
}
