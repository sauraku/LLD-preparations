package utils;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items = new ArrayList<>();

    public Cart() {
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        items.add(item);
    }
    
    public void removeItem(Item item){
        items.remove(item);
    }
    
    public void updateItem(Item item, int quantity){
        if(quantity==0){
            removeItem(item);
        } else {
            for(Item i: items){
                if(i.getProduct().getId()==item.getProduct().getId()){
                    i.setQuantity(quantity);
                }
            }
        }
    }
}
