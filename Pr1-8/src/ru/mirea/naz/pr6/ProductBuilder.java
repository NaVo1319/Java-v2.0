package ru.mirea.naz.pr6;

public class ProductBuilder implements Builder {
    Product product=Product.of("V1");
    public Product get(){
        return product;
    }
    @Override
    public void setName(String name) {
        product.setName(name);

    }

    @Override
    public void setType(String type) {
        product.setType(type);
    }
}
