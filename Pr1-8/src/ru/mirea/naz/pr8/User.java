package ru.mirea.naz.pr8;

abstract public class User {
    TextMediator text;
    String name;
    User(TextMediator text, String name){
        this.text=text;
        this.name=name;
    }
    abstract void setMessage(String message);
    abstract void getMessage(String message);
}
