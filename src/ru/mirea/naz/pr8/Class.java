package ru.mirea.naz.pr8;

public class Class {
    int value =1;
    int value2=23;
    String name="Class";

    @Override
    public String toString() {
        return "Class{" +
                "value=" + value +
                ", value2=" + value2 +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    String text="Привет";
    public Snapshot save(){
        return new Snapshot(value, value2,name, text, this);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
