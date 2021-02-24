package ru.mirea.naz.pr4;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService service=Executors.newFixedThreadPool(2);
        service.submit(()->{
            try {
                Thread.sleep(600);
                System.out.println("Три");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        service.submit(()->{
            try {
                Thread.sleep(400);
                System.out.println("Два");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        service.submit(()->{
            try {
                Thread.sleep(200);
                System.out.println("Один");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
