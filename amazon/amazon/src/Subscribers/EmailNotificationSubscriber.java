package Subscribers;

import Users.User;

public class EmailNotificationSubscriber extends Subscriber{
    public EmailNotificationSubscriber(User user) {
        super(user);
    }

    @Override
    public void getNotified(String msg) {
        System.out.println("Email to "+ user.getUserID() +" : " + msg);
    }
}
