package com.company;

public class Item {
    private String name;
    private long prix;
    private int weight;

    Item(String p_name, long p_prix, int p_weight){
        this.name = p_name;
        this.prix = p_prix;
        this.weight = p_weight;
    }

    public String getName(){
        return this.name;
    }

    public long getPrix(){
        return this.prix;
    }

    public int getWeight(){
        return this.weight;
    }

    public String toString() {
        return this.name + " : " + String.format("%d.%02d",this.prix,0) + " €";
    }

    public void display() {
        System.out.println(this.toString());
    }
}
