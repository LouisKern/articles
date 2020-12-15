package com.company;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    private List<Item> cart = new ArrayList();

    ShoppingCart(){
        id++;
        // renvoie que des 1, pas eu le temps de finir.
    }

    public void addItem(Item p_item){
        if(p_item.getWeight()>1000){
            throw new IllegalStateException(" Votre article ne dois pas dépasser 1 kg !");
        }
        else{
            cart.add(p_item);
        }

    }

    public int getId(){
        return this.id;
    }

    public boolean removeItem(Item p_item){
        if(cart.contains(p_item)){
            cart.remove(p_item);
        }
        else {
            return false;
        }
        return true;
    }

    public int itemCount(){
        return cart.size();
    }

    public long totalPrice(){
        long total=0;
        for (Item temp : cart) {
            total = total + temp.getPrix();
        }
        return total;
    }

}
