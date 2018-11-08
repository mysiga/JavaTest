package com.mysiga.learn.facade;

/**
 * Created by Wilson on 2018/8/8.
 */
public class Facade {
    private BaseCup cup;
    private BaseTea tea;
    private BaseDesk desk;

    public Facade() {
        cup = new BigCup();
        tea = new RedTea();
        desk = new SmallDesk();
    }

    public Facade(BaseCup cup, BaseTea tea, BaseDesk desk) {
        this.cup = cup;
        this.tea = tea;
        this.desk = desk;
    }

    public void eat() {
        tea.getTea();
        cup.getCupName();
        desk.getDeskName();
    }
}
