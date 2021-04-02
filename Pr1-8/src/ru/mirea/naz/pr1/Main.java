package ru.mirea.naz.pr1;

import java.util.function.Function;

public class Main implements Function {

    public static void main(String[] args) {
        Main del=new Main();
        int x=12,y=6;
        int[] z={x,y};
        System.out.println(del.apply(z));
    }

    @Override
    public Object apply(Object o) {
        int[] pair=(int[]) o;
        int x=pair[0],y=pair[1];
        if(y==0){return x;}
        else{pair[0]=y;pair[1]=x%y;}
        return apply(pair);
    }
}
