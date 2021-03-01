package ru.mirea.naz.pr6;

public class FactoryV1 implements FactoryAbstract {
    @Override
    public Product makeProduct() {
        return new ProductV1();
    }
}
