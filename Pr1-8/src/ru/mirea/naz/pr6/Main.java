package ru.mirea.naz.pr6;

public class Main {
    public static void main(String[] args) {
        Product productV1_1=Product.of("V1");
        Product productV2_1=Product.of("V2");
        productV1_1.getProduct();
        productV2_1.getProduct();


        FactoryAbstract factoryV1=new FactoryV1();
        FactoryAbstract factoryV2=new FactoryV2();
        Product productV1_2=factoryV1.makeProduct();
        Product productV2_2=factoryV2.makeProduct();
        productV1_2.getProduct();
        productV2_2.getProduct();

        Builder builder=new ProductBuilder();
        builder.setName("Продукт");
        builder.setType("Плохой");
        productV1_1=builder.get();
        System.out.println(productV1_1.getName()+" "+productV1_1.getType());
        Product clone=productV1_1.clone();
        System.out.println(clone.getName()+" "+clone.getType());
    }
}
