package ru.mirea.naz.pr6;

public interface Product {
    void getProduct();
    String getName();
    void setName(String name);
    String getType();
    void setType(String type);
    static Product of(String type){
        if(type.equals("V1")){
            return new ProductV1();
        }
        else  if(type.equals("V2")){
            return new ProductV2();
        }
        return null;
    };
    Product clone();
}
