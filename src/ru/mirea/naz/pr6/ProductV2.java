package ru.mirea.naz.pr6;

public class ProductV2 implements Product {
    String name;
    String type;
    ProductV2(){}
    ProductV2(ProductV2 product){
        name=product.getName();
        type= product.getType();

    }
    @Override
    public Product clone() {
        return new ProductV2(this);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void getProduct() {
        System.out.println("Продукт версси - 2");
    }
}
