package ru.mirea.naz.pr7;

public class Product implements ProductInterface {
    String name;

    public String getName() {
        return name;
    }

    Product(String name){
        this.name=name;
    }
    public void pay(){
        System.out.println("Покупка");
    }
}
