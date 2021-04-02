package ru.mirea.naz.pr7;

public class HardSoftFacade {
    HardSoft soft;
    HardSoftFacade(HardSoft soft){
        this.soft=soft;
    }
    public void actions(){
        soft.action();
        soft.actionToAdd();
        soft.del();
        soft.StrongAction();
        soft.impossible();
        soft.final_();
    }
}
