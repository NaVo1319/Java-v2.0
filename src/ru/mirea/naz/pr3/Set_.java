package ru.mirea.naz.pr3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_ {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        Thread x=new Thread(()->{
            Iterator<Integer> i = set.iterator();
            while (i.hasNext())
                System.out.println(i.next());
        });
        Thread y=new Thread(()->{
            Iterator<Integer> i = set.iterator();
            while (i.hasNext())
                System.out.println(i.next());
        });
        x.start();
        y.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
