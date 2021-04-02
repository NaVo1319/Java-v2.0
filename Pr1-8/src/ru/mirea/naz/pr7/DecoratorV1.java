package ru.mirea.naz.pr7;

public class DecoratorV1 extends DecoratorAbstract {
    DecoratorV1(ProductInterface product, String name) {
        super(product,name);
    }
    @Override
    public void advancedPay() {
        System.out.println("Улучшенная покупка");
    }
}
