package ru.mirea.naz.pr5;

import java.util.ArrayList;

class SingletonV1{
    private SingletonV1 instance;
    public synchronized SingletonV1 getInstance() {
        if(instance == null) {
            instance = new SingletonV1();
            return instance;
        }
        return instance;
    }

}
class SingletonV2{
    public static final SingletonV2 INSTANCE = new SingletonV2();
    public SingletonV2 getInstance(){
        return INSTANCE;
    }
}
enum SingletonV3 {
    INSTANCE;
    public SingletonV3 getInstance() {
        return INSTANCE;
    }
}

public class Main {
    public static void main(String[] args) {
        SingletonV1 one=new SingletonV1();
        SingletonV2 two=new SingletonV2();
        SingletonV3 three;
    }
}
