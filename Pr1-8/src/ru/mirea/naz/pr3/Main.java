package ru.mirea.naz.pr3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        Set_<Integer> one=new Set_<>();
        Thread first=new Thread(()->{
            for(int i=0;i<100;++i){
                one.add(i);
            }
        });
        Thread second=new Thread(()->{
            for(int i=0;i<100;++i){
                one.add(i+100);
            }
        });
        first.start();
        second.start();
        Thread.sleep(3000);
        System.out.println(Arrays.toString(one.toArray()));
        System.out.println();
        Map_<Integer,String> two=new Map_<>();
        Thread first_2=new Thread(()->{
            for(int i=0;i<100;++i){
                two.put(i,"a");
            }
        });
        Thread second_2=new Thread(()->{
            for(int i=0;i<100;++i){
                two.put(i+100,"b");
            }
        });
        first_2.start();
        second_2.start();
        Thread.sleep(3000);
        for (Integer key : (Set<Integer>)two.keySet()) {
            System.out.printf(key + " " + two.get(key)+" | ");
        }
    }
}
