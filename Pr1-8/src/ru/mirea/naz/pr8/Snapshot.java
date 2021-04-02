package ru.mirea.naz.pr8;

public class Snapshot {
    int value =1;
    int value2=23;
    String name="Class";
    String text="Привет";
    Class cl=new Class();

    public Snapshot(int value, int value2, String name, String text, Class cl) {
        this.value = value;
        this.value2 = value2;
        this.name = name;
        this.text = text;
        this.cl = cl;
    }
    public void restore(){
        cl.name=name;
        cl.text=text;
        cl.value=value;
        cl.value2=value2;
    }
}
