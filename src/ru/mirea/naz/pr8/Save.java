package ru.mirea.naz.pr8;

public class Save {
    Snapshot save;
    public void save(Class cl){
        save= cl.save();
    }
    public void restore(){
        save.restore();
    }
}
