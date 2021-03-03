package ru.mirea.naz.pr8;

public class Human extends User {
    public Human(TextMediator text,String name) {
        super(text,name);
    }

    @Override
    void setMessage(String message) {
        System.out.println("---------------"+message);
        super.text.setMessage(this,message);
    }

    @Override
    void getMessage(String message) {
        System.out.println(super.name+" Получает сообщение (Человек)");
    }
}
