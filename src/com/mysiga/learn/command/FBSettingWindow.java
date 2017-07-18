package com.mysiga.learn.command;

import java.util.ArrayList;

/**
 * Created by Wilson on 2017/7/17.
 */
public class FBSettingWindow {
    private String title;
    private ArrayList<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }

    public void removeFuctionButton(FunctionButton fb) {
        functionButtons.remove(fb);
    }

    public void display() {
        System.out.println("显示窗口:" + title);
        System.out.println("显示功能键：");
        for (FunctionButton functionButton : functionButtons) {
            System.out.println(functionButton.getName());
        }
        System.out.println("---------------------------------");
    }
}
