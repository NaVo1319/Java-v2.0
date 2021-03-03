package ru.mirea.naz.pr8;

public class Main {
    public static void main(String[] args) {
        TextMediator mediator=new TextMediator();
        User human=new Human(mediator,"Человек");
        User bootV1=new Boot(mediator,"Бот-1");
        User bootV2=new Boot(mediator,"Бот-2");
        mediator.add(human);
        mediator.add(bootV1);
        mediator.add(bootV2);
        human.setMessage("Привет");

        Class cl=new Class();
        System.out.println(cl.toString());
        Snapshot backup=cl.save();
        cl.setText("Текста нет");
        cl.setValue(0);
        cl.setValue2(0);
        System.out.println(cl.toString());
        backup.restore();
        System.out.println(cl.toString());

    }
}
