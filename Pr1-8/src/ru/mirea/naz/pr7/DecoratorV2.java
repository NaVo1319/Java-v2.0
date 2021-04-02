package ru.mirea.naz.pr7;

public class DecoratorV2 extends DecoratorAbstract {
    DecoratorV2(ProductInterface product,String name) {
        super(product,name);
    }

    @Override
    public void advancedPay() {

    }
}
