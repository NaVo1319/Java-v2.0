package ru.mirea.naz.pr6;

public class FactoryV2 implements FactoryAbstract {
    @Override
    public Product makeProduct() {
        return new ProductV2();
    }
}
