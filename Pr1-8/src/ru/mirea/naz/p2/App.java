package ru.mirea.naz.p2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    ArrayList<Human> humans;

    public App() {
        humans=new ArrayList<>();
        humans.add(new Human(15, "Иван", "Щульц", LocalDate.now(),67));
        humans.add(new Human(45, "Григорий", "Мекас", LocalDate.now(),34));
        humans.add(new Human(23, "Бобер", "Бобёр", LocalDate.now(),20));
        humans.add(new Human(10, "Алексей", "Алед", LocalDate.now(),67));
    }
    public void sortSecond(){
        Comparator<Human> secondCompare=new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                String first=o1.getFirstName().charAt(1)+"";
                String last= o2.getFirstName().charAt(1)+"";
                return first.compareTo(last);
            }
        };
        Stream<Human> stream=humans.stream();
        stream.sorted((secondCompare)).forEach(e-> System.out.println(e));
    }
    public void filter(){
        Stream<Human> stream=humans.stream();
        stream.filter(e->e.getWeight()%10==0).forEach(e-> System.out.println(e));
    }
    public  void sortAgeWeight(){
        Comparator<Human> secondCompare=new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                double x=o1.getAge()* o1.getWeight();
                double y=o2.getAge()* o2.getWeight();
                return ((Double)x).compareTo(y);
            }
        };
        Stream<Human> stream=humans.stream();
        stream.sorted((secondCompare)).forEach(e-> System.out.println(e));
    }
    public void weight(){
        Stream<Human> stream=humans.stream();
        int result=stream.reduce(1, (x, y)->x*y.getWeight(),(x, y)->x*y);
        System.out.println(result);
    }
}
