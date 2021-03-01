package ru.mirea.naz.pr7;

public abstract class DecoratorAbstract implements ProductInterface {
    ProductInterface product;
    String name;
    DecoratorAbstract(ProductInterface product,String name){
        this.name=name;
        this.product=product;
    }

    @Override
    public String getName() {
        return product.getName()+", "+name;
    }

    public abstract void advancedPay();
    @Override
    public void pay(){
        System.out.println("Покупка");
    }
}
