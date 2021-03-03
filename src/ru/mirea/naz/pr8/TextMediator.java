package ru.mirea.naz.pr8;

import java.util.ArrayList;

public class TextMediator implements Mediator {
    ArrayList<User> users=new ArrayList<>();
    public void add(User user){
        users.add(user);
    }
    public void del(User user){
        users.remove(user);
    }
    @Override
    public void setMessage(User user, String message) {
        for(User u: users){
            if(!user.name.equals(u.name)){
                u.getMessage(message);
            }
        }
    }
}
