package ru.mirea.naz.pr8;

public class Boot extends User {
    public Boot(TextMediator text,String name) {
        super(text,name);
    }

    @Override
    void setMessage(String message) {
        super.text.setMessage(this,message);
    }

    @Override
    void getMessage(String message) {
        System.out.println(super.name+" Получает сообщение (Бот)");
        if(message.contains("При")){
            System.out.println("---------------Привет Я "+super.name);
        }
    }
}
