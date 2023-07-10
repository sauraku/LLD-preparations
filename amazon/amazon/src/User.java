public abstract class User {
    private String userID;

    private Cart cart  = new Cart();

    public User(String userID) {
        this.userID = userID;
    }
    
    public void search(){
        // todo:
    }
    
    public void addToCart(Item item){
        cart.addItem(item);
    }
    
    public void removeFromCart(Item item){
        cart.removeItem(item);
    }


    public void updateItemInCart(Item item, int quantity){
        cart.updateItem(item, quantity);
    }


    public String getUserID() {
        return userID;
    }

    public Cart getCart() {
        return cart;
    }
}
