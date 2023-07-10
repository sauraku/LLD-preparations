package Subscribers;

import Users.User;

public abstract class Subscriber {
    User user;

    public Subscriber(User user){
        this.user = user;
    }

    public abstract void getNotified(String msg);
}
