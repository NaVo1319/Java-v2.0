package ru.mirea.naz.pr7;

public class Main {
    public static void main(String[] args) {
        ProductInterface product=new Product("Яблоко");
        System.out.println(product.getName());
        product=new DecoratorV1(product,"Спелое");
        System.out.println(product.getName());
        product=new DecoratorV2(product,"Очень");
        System.out.println(product.getName());
        //////
        System.out.println("//////////");
        HardSoftFacade facade=new HardSoftFacade(new HardSoft());
        facade.actions();
    }
}
